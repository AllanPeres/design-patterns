package com.allan.studies;

import static java.lang.String.format;

public class SingleObject {

    private static int NUM_INSTS = 0;

    private static SingleObject instance = new SingleObject();

    private SingleObject() {
        NUM_INSTS++;
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public String showMessage() {
        return format("There are %d instances", NUM_INSTS);
    }
}
