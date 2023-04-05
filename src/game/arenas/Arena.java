package game.arenas;
import java.util.ArrayList;
public abstract class Arena { //Arena is abstract class


    private  ArrayList<Racer> activeRacer;
    private ArrayList<Racer> completedRacers;
    private final double FRICTION ;
    private final int MAX_RACERS;
    private final static int MIN_Y_GAP =10 ; //default value
    private double length;  // x value of finish line.
   private EnumContainer.ArenaType arenaType;//////////////////////////


    //Constructors
/**
 * @param length- the size of racers list
 * @param MAX_RACERR - the max number of players who can compete in race.
 * @param FRICTION -the friction of the arena
 */
    public Arena(double length, int MAX_RACERR, double FRICTION){
        this.activeRacer= new ArrayList<Racer>(); //define new list of racers
        this.completedRacers= new ArrayList<Racer>();
        this.length = length;
        this.MAX_RACERS = MAX_RACERR;
        this.FRICTION = FRICTION;
        this.arenaType = EnumContainer.ArenaType.BASE_ARENA;
    }

    // methods

    public void addRacer(Racer newRacer)













}
