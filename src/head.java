import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class head extends Coach {
	protected int winS; //Regular season wins
	protected int loseS; //Regular season losses
	protected int tieS; //Regular season ties
	protected int overtimeLS; //Regular season overtime loses
	protected int gameCS; //Regular season games coached
	protected double pointPS; //Regular season Points percentage (number of points team earned divided by total possible points)
	protected int winP; //Playoff wins
	protected int loseP; //Playoff loses
	protected int gameCP; //Playoff games coached
	protected int stanleyN; //Number of Stanley Cups
	protected int totalGamesCoached; //Total number of games coached, calculated

	public head(String fname, String lname, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			int winS, int loseS, int tieS, int overtimeLS, int gameCS, double pointPS, int winP, int loseP, int gameCP, int stanleyN) {//coach fields
		super(fname, lname, gender, height, weight, month, day, year, place, mStatus);

		this.winS = winS;
		this.loseS = loseS;
		this.tieS = tieS;
		this.overtimeLS = overtimeLS;
		this.gameCS = gameCS;
		this.pointPS = pointPS;
		this.winP = winP;
		this.loseP = loseP;
		this.gameCP = gameCP;
		this.stanleyN = stanleyN;
		updatetotalGamesCoached();
	}

	/**
	 * Loads the head coach data from a text file into this head object
	 * @author MK, AV, CH, PJ
	 * @throws IOException 
	 * @overrides load in Coach
	 */
	public void load(BufferedReader br) throws IOException {
		
		super.load(br); //loads coach fields
		String x;
		//loads head coach fields into the object

		x = br.readLine();
		winS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		loseS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		putOvertimeLS(Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length())));

		x = br.readLine();
		gameCS = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		pointPS = Double.parseDouble(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		winP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		loseP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		gameCP = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		stanleyN = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));

		x = br.readLine();
		totalGamesCoached = Integer.parseInt(x.substring(x.indexOf(": ")+2,x.length()));
	}

	/**
	 * Saves statistics of a head coach onto a text file
	 * @param pw of type PrintWriter
	 * @overrides save in Coach
	 */
	public void save(PrintWriter pw){
		super.save(pw);
		pw.println("Regular Season Wins: "+winS);
		pw.println("Regular Season Loses: "+loseS);
		pw.println("Regular Season Ties: "+tieS);
		pw.println("Regular Season Overtime Loses: "+overtimeLS);
		pw.println("Regular Season Games Coached: "+gameCS);
		pw.println("Season Points Percentage: "+pointPS);
		pw.println("Playoff Wins: "+winP);
		pw.println("Playoff Loses: "+loseP);
		pw.println("Playoff Games Coached: "+gameCP);
	}

	//Accessor Methods
	/**
	 * Returns regular season wins
	 * @return winS
	 */
	public int getWinS(){
		return winS;
	}

	/**
	 * Returns regular season loses
	 * @return loseS
	 */
	public int getloseS(){
		return loseS;
	}

	/**
	 * Returns the number of regular season ties
	 * @return the tieS
	 */
	public int getTieS() {
		return tieS;
	}

	/**
	 * Returns the number of regular season overtime loses
	 * @return the overtimeLS
	 */
	public int getOvertimeLS() {
		return overtimeLS;
	}

	/**
	 * Returns regular season games coached
	 * @return gameCS
	 */
	public int getGameCS(){
		return gameCS;
	}


	/**
	 * Returns regular season point percentage
	 * <p>
	 * Number of points team earned divided by total possible points
	 * @return pointPS
	 */
	public double getPointPS(){
		updatePointPS();
		return pointPS;
	}

	/**
	 * Returns playoff wins
	 * @return winP
	 */
	public int getWinP(){
		return winP;
	}

	/**
	 * Returns playoff loses
	 * @return loseP
	 */
	public int getLoseP(){
		return loseP;
	}

	/**
	 * Returns playoff games coached
	 * @return gameCP
	 */
	public int getGameCP(){
		return gameCP;
	}

	/**
	 * Returns number of Stanley Cups won
	 * @return stanleyN
	 */
	public int getStanleyN(){
		return stanleyN;
	}

	/**
	 * Returns total games coached
	 * @return totalGamesCoached
	 */
	public int gettotalGamesCoached() {
		return totalGamesCoached;
	}

	//Mutator Methods
	/**
	 * Stores parameter to winS
	 * @param x of type int
	 */
	public void putWinS(int x){
		winS=x;
	}

	/**
	 * Stores parameter to loseS
	 * @param x of type int
	 */
	public void putLoseS(int x){
		loseS=x;
	}

	/**
	 * Stores parameter to tieS
	 * @param x of type int
	 */
	public void putTieS(int x) {
		tieS = x;
	}


	/**
	 * Stores parameter to overtimeLS
	 * @param x of type int
	 */
	public void putOvertimeLS(int x) {
		overtimeLS = x;
	}

	/**
	 * Stores parameter to gameCS
	 * @param x of type int
	 */
	public void putGameCS(int x){
		gameCS=x;
	}

	/**
	 * Stores parameter to pointPS
	 * @param x of type double
	 */
	public void putPointPS(double x){
		pointPS=x;
	}

	/**
	 * Stores parameter to winP
	 * @param x of type int
	 */
	public void putWinP(int x){
		winP=x;
	}

	/**
	 * Stores parameter to loseP
	 * @param x of type int
	 */
	public void putLoseP(int x){
		loseP=x;
	}

	/**
	 * Stores parameter to gameCP
	 * @param x of type int
	 */
	public void putGameCP(int x){
		gameCP=x;
	}

	/**
	 * Stores parameter to StanleyN
	 * @param x of type int
	 */
	public void putStanleyN(int x){
		stanleyN=x;
	}

	/**
	 * Stores parameter to totalGamesCoached 
	 * Note: should only be used in loading methods
	 * @param x of type int
	 */
	public void puttotalGamesCoached(int x) {
		totalGamesCoached = x;
	}

	//Update Methods
	/**
	 * updates totalGames Coached
	 */
	public void updatetotalGamesCoached() {
		totalGamesCoached = gameCP + gameCS;
	}

	/**
	 * Calculates the Point percentage for regular season
	 * @return Calculated point percentage
	 */
	public void updatePointPS(){
		pointPS=(tieS+overtimeLS+(2*winS))/(2*gameCS);
	}
}
