package cs112.ud3;

import java.lang.Character;

public class NameAlreadyTakenException extends Exception {

    java.lang.Character duplicate;

    public NameAlreadyTakenException() {
        super("ERROR: User already exists, please try another.");
    }

    public NameAlreadyTakenException(String message, java.lang.Character duplicate) {
        super(message + " You tried the name: " + duplicate);
        this.duplicate = duplicate;
    }

    public Character getCharacter() {
        return this.duplicate;
    }

}