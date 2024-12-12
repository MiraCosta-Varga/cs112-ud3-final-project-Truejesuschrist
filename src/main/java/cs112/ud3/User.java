package cs112.ud3;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public abstract class User {
    //CONSTANT VARIABLES
    public static final String DEFAULT_NAME = "JOHN DOE";
    public static final int DEFAULT_HEIGHT = 1, DEFAULT_WEIGHT = 1;


    //INSTANCE VARIABLES
    private String name;
    private int weight, height;

    //CONSTRUCTORS
    public User(String name, int weight, int height) {
        this.setAll(name,weight,height);
        if (!this.setAll(name, weight, height)) {
            System.out.println("ERROR: invalid data given to full User constructor. Shutting down.");
            System.out.println(this.setName(name));

        }


    }

    public User() {
        this(DEFAULT_NAME, DEFAULT_WEIGHT, DEFAULT_HEIGHT);
    }

    public User(User original) {
        if (original == null) {
            System.out.println("ERROR: null data given to copy User constructor. Shutting down.");
            System.exit(0);
        }
    }


    //SETTERS
    public boolean setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public boolean setHeight(int height) {
        if (height >= 0) {
            this.height = height;
            return true;
        } else {
            return false;
        }
    }

    public boolean setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAll(String name, int weight, int height) {
        return this.setName(name) && this.setWeight(weight) && this.setHeight(height);
    }


    //GETTERS
    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }


    //OTHER METHODS
    @Override
    public String toString() {
        return String.format("User's name: %s%nWeight: %d%nHeight: %d%n", this.name, this.weight,
                this.height);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other instanceof User) {
            return false;
        }
        User otherUser = (User)other;
        return this.name.equals(otherUser.name) && this.weight == otherUser.weight && this.height == otherUser.height;
    }


    //ABSTRACT METHODS


    public abstract String List();

}