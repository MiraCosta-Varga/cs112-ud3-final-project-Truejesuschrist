package cs112.ud3;

public class Arms extends User {

    public Arms(String name, int weight, int height) {
        super(name, weight, height);
    }


    //OTHER METHODS


    @Override
    public String catchPhrase() {
        return "Lat Pulldown \nIso-lateral row\nReverse Fly\nBicep Curl\nIncline Curl\nShrug\nCardio";

    }
}