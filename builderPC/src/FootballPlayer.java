public class FootballPlayer {
    private String name;
    private String league;
    private String club;
    private String nationality;
    private BetterFoot betterFoot;
    private int skillMoves;
    private int weakFoot;
    private int pace;
    private int shooting;
    private int passing;
    private int dribbling;
    private int defending;
    private int physicality;

    public FootballPlayer(String name, String league, String club, String nationality, BetterFoot betterFoot, int skillMoves,
                          int weakFoot, int pace, int shooting, int passing, int dribbling, int defending, int physicality){
        this.name=name;
        this.league=league;
        this.club=club;
        this.nationality=nationality;
        this.betterFoot=betterFoot;
        this.skillMoves=skillMoves;
        this.weakFoot=weakFoot;
        this.pace=pace;
        this.shooting=shooting;
        this.passing=passing;
        this.dribbling=dribbling;
        this.defending=defending;
        this.physicality=physicality;
    }

    public String getName() {
        return name;
    }

    public String getLeague() {
        return league;
    }

    public String getClub() {
        return club;
    }

    public String getNationality() {
        return nationality;
    }

    public BetterFoot getBetterFoot() {
        return betterFoot;
    }

    public int getSkillMoves() {
        return skillMoves;
    }

    public int getWeakFoot() {
        return weakFoot;
    }

    public int getPace() {
        return pace;
    }

    public int getShooting() {
        return shooting;
    }

    public int getPassing() {
        return passing;
    }

    public int getDribbling() {
        return dribbling;
    }

    public int getDefending() {
        return defending;
    }

    public int getPhysicality() {
        return physicality;
    }
}
