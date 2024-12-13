package cs112.ud3;

public class Arms extends User {

    //CONSTANT VARIABLES
    public static final String DEFAULT_NAME = "DEFAULT_ARMS";
    public static final int DEFAULT_WEIGHT = 1, DEFAULT_HEIGHT = 1;

    //CONSTRUCTORS
    public Arms(String name, int weight,int height){
        super(name, weight, height);
    }

    public Arms() {
        this(Arms.DEFAULT_NAME, Arms.DEFAULT_WEIGHT, Arms.DEFAULT_HEIGHT);
    }

    public Arms(Arms original) {
        super(original);
    }


    @Override
    public String List() {
        return "Lat Pulldown \nIso-lateral row\nReverse Fly\nBicep Curl\nIncline Curl\nShrug\nCardio";

    }


}