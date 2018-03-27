
public class Player {
	private String season;
	private String age;
	private String team;
	private String league;
	private String position;
	private int gamesPlayed;
	private int gamesStarted;
	private double offensiveReboundsPerGame;
	private double defensiveReboundsPerGame;
	private double totalRebounds;
	private double assistsPerGame;
	private double steals;
	private double blocks;
	private double turnovers;
	private double personalFouls;
	private double pointsPerGame;
	Player(	 String season,String age, String team, String league,String position,int gamesPlayed,int gamesStarted,double offensiveReboundsPerGame,
	 double defensiveReboundsPerGame,
	double totalRebounds,
	 double assistsPerGame,
	 double steals,
	 double blocks,
	 double turnovers,
	 double personalFouls,
	 double pointsPerGame){
		this.season = season;
		this.age =age;
		this.team = team;
		this.league = league;
		this.position = position;
		this.gamesPlayed = gamesPlayed;
		this.gamesStarted = gamesStarted;
		this.offensiveReboundsPerGame = offensiveReboundsPerGame;
		this.defensiveReboundsPerGame = defensiveReboundsPerGame;
		this.totalRebounds = totalRebounds;
		this.assistsPerGame = assistsPerGame;
		this.steals = steals;
		this.blocks = blocks;
		this.turnovers = turnovers;
		this.personalFouls = personalFouls;
		this.pointsPerGame = pointsPerGame;
	}
	public double offensiveEfficiency() {
		return pointsPerGame + totalRebounds + assistsPerGame - turnovers;
	}
	public double defensiveEfficiency() {
		return steals+blocks - personalFouls/2.0;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public String offensiveToString() {
		return "In season " + season + " recorded a offensive stat line of: " + pointsPerGame + " points, " + totalRebounds + " rebounds, " + assistsPerGame + " assists per" + "\n" + " game with " + turnovers + " turnovers.";
	}
	public String defensiveToString() {
		return "In season " + season + " recorded a defensive stat line of: " + blocks + " blocks and " + steals + " steals per" + "\n" + " game with " + personalFouls + " fouls per game. ";
	}
}
