public class Defense extends Player{
  
	private int plusMinus; //Holds +/- for each player
	private double avgGoalsPS; //Average goals per season
	private double avgGoalPercentagePS; //Average goal percentage per season
	private double avgShotsPS; //Average shots taken per season
	private double zsGoalPercentage; //Z-score of goal percentage 
	private double avgAssistsPS; //Average assists per season
	private double avgPenaltyPS; //Average penalty minutes per season
	private double avgPPGoalsPS; //Average power play goals per season (double)
	private double avgSOGoalsPS; //Average shoot-out goals per season
	/*added field*/private double avgNShifts; //Average number of shifts per game
	private int gwGoals; //Number of game-winning goals
	private int ppGoals; //Number of power play goals
	private int soGoals; //Number of shoot-out goals
	/*added field*/private int otGoals; //Number of overtime goals
	/*added field*/private double faceoffPercentage; //Face off win percentage
	/*added field*/private double points; //Points (don't know what this means)
	/*added field*/private double shootPercentage; //Shooting Percentage

	public Defense(String fname, String lname, int age, boolean gender, double height, double weight, int month, int day, int year, int place, int mStatus,//person fields
			double salaryPY, int contractR, double tSalary, int rating, int gp, double penaltyT, int penaltyN, boolean arm, int number, //player fields
			int plusMinus, double avgGoalsPS, double avgGoalPercentagePS, double avgShotsPS, double zsGoalPercentage, double avgAssistsPS, //forward fields
			double avgPenaltyPS, double avgPPGoalsPS, double avgSOGoalsPS, double avgNShifts, int gwGoals, int ppGoals, int soGoals, int otGoals, 
			double FaceoffPercentage, double points, double ShootPercentage, double faceoffPercentage, double shootPercentage) {
		super(fname, lname, age, gender, height, weight, month, day, year, place, mStatus, //person fields
			salaryPY, contractR, tSalary, rating, gp, penaltyT, penaltyN, arm, number, ShootPercentage, arm, otGoals, otGoals, otGoals, otGoals, otGoals); //player fields


		this.plusMinus = plusMinus;
		this.avgGoalsPS = avgGoalsPS;
		this.avgGoalPercentagePS = avgGoalPercentagePS;
		this.avgShotsPS = avgShotsPS;
		this.zsGoalPercentage = zsGoalPercentage;
		this.avgAssistsPS = avgAssistsPS;
		this.avgPenaltyPS = avgPenaltyPS;
		this.avgPPGoalsPS = avgPPGoalsPS;
		this.avgSOGoalsPS = avgSOGoalsPS;
		this.avgNShifts = avgNShifts;
		this.gwGoals = gwGoals;
		this.ppGoals = ppGoals;
		this.soGoals = soGoals;
		this.otGoals = otGoals;
		this.faceoffPercentage = faceoffPercentage;
		this.points = points;
		this.shootPercentage = shootPercentage;
	}
	//Accessor Methods

	/**
	 * Returns +/- of a player
	 * @return plusMinus
	 * @author MK, AV, CH, PJ
	 */
	public int getplusMinus() {
		return plusMinus;
	}
	/**
	 * Returns average goals per season of a player
	 * @return avgGoalsPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgGoalsPS() {
		return avgGoalsPS;
	}
	/**
	 * Returns average goal percentage per season of a player
	 * @return avgGoalPercentagePS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgGoalPercentagePS() {
		return avgGoalPercentagePS;
	}
	/**
	 * Returns average number of shots per season of a player
	 * @return avgShotsPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgShotsPS() {
		return avgShotsPS;
	}
	/**
	 * Returns z-score of goal percentage of a player
	 * @return zsGoalPercentage
	 * @author MK, AV, CH, PJ
	 */
	public double getzsGoalPercentage() {
		return zsGoalPercentage;
	}
	/**
	 * Returns average assists per season of a player
	 * @return avgAssistsPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgAssistsPS() {
		return avgAssistsPS;
	}
	/**
	 * Returns average penalty minutes per season of a player
	 * @return avgPenaltyPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgPenaltyPS() {
		return avgPenaltyPS;
	}
	/**
	 * Returns average power play goals per season of a player
	 * @return avgPPGoalsPS
	 * @author MK, AV, CH, PJ
	 */
	public double getavgPPGoalsPS() {
		return avgPPGoalsPS;
	}
	/**
	 * Returns the average number of shifts per game
	 * @return avgNShifts
	 * @author MK, AV, CH, PJ
	 */
	public double getAvgNShifts() {
		return avgNShifts;
	}

	/**
	 * Returns the number of game-winning goals
	 * @return gwGoals
	 * @author MK, AV, CH, PJ
	 */
	public int getGWGoals() {
		return gwGoals;
	}

	/**
	 * Returns the number of power-play goals
	 * @return ppGoals
	 * @author MK, AV, CH, PJ
	 */
	public int getPPGoals() {
		return ppGoals;
	}

	/**
	 * Returns the number of shoot-out goals
	 * @return soGoals
	 * @author MK, AV, CH, PJ
	 */
	public int getSOGoals() {
		return soGoals;
	}

	/**
	 * Returns the number of overtime goals
	 * @return otGoals
	 * @author MK, AV, CH, PJ
	 */
	public int getOTGoals() {
		return otGoals;
	}

	/**
	 * Returns faceoff percentage
	 * @return faceoffPercentage
	 * @author MK, AV, CH, PJ
	 */
	public double getFaceoffPercentage() {
		return faceoffPercentage;
	}

	/**
	 * Returns points
	 * @return points
	 * @author MK, AV, CH, PJ
	 */
	public double getPoints() {
		return points;
	}

	/**
	 * Returns shooting percentage
	 * @return shootPercentage
	 * @author MK, AV, CH, PJ
	 */
	public double getShootPercentage() {
		return shootPercentage;
	}

	//Mutator methods

	/**
	 * stores parameter to plusMinus
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putplusMinus(int x) {
		plusMinus = x;
	}
	/**
	 * stores parameter to avgGoalsPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgGoalsPS(double x) {
		avgGoalsPS = x;
	}
	/**
	 * stores parameter to avgGoalPercentagePS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgGoalPercentagePS(double x) {
		avgGoalPercentagePS = x;
	}
	/**
	 * stores parameter to avgShotsPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgShotsPS(double x) {
		avgShotsPS = x;
	}
	/**
	 * stores parameter to zsGoalPercentage
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putzsGoalPercentage(double x) {
		zsGoalPercentage = x;
	}
	/**
	 * stores parameter to avgAssistsPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgAssistsPS(double x) {
		avgAssistsPS = x;
	}
	/**
	 * stores parameter to avgPenaltyPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgPenaltyPS(double x) {
		avgPenaltyPS = x;
	}
	/**
	 * stores parameter to avgPPGoalsPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgPPGoalsPS(double x) {
		avgPPGoalsPS = x;
	}
	/**
	 * stores parameter to avgSOGoalsPS
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putavgSOGoalsPS(double x) {
		avgSOGoalsPS = x;
	}

	/**
	 * stores parameter to avgNShifts
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void putAvgNshifts(int x){
		avgNShifts = x;
	}

	/**
	 * stores parameter to gwGoals
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putGWGoals(int x){
		gwGoals = x;
	}

	/**
	 * stores parameter to ppGoals
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putPPGoals(int x){
		ppGoals = x;
	}

	/**
	 * stores parameter to soGoals
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void putSOGoals(int x){
		soGoals = x;
	}

	/**
	 * stores parameter to otGoals
	 * @param x of type int
	 * @author MK, AV, CH, PJ
	 */
	public void getOTGoals(int x) {
		otGoals = x;
	}

	/**
	 * stores parameter to faceoffPercentage
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void getFaceoffPercentage(double x) {
		faceoffPercentage = x;
	}

	/**
	 * stores parameter to points
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void getPoints(double x) {
		points = x;
	}

	/**
	 * stores parameter to shootPercentage
	 * @param x of type double
	 * @author MK, AV, CH, PJ
	 */
	public void getShootPercentage(double x) {
		shootPercentage = x;
	}
}
