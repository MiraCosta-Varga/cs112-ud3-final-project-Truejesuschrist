package cs112.ud3;

public class Legs extends User {

    //CONSTANT VARIABLES
    public static final String DEFAULT_NAME = "DEFAULT_LEGS";
    public static final int DEFAULT_WEIGHT = 1, DEFAULT_HEIGHT = 1;

    //CONSTRUCTORS
    public Legs(String name, int weight,int height){
        super(name, weight, height);
    }

    public Legs() {
        this(Legs.DEFAULT_NAME, Legs.DEFAULT_WEIGHT, Legs.DEFAULT_HEIGHT);
    }

    public Legs(Legs original) {
        super(original);
    }


    //OTHER METHODS
    @Override
    public String catchPhrase() {
        return "Make Sure to bend your knees and go all the way down";
    }
}