package com.allan.studies.adapter;

public class App {

    public static void main(String[] args) {
        BowMaster bowMaster = new BowMaster(new ExplosiveBowAdapter());
        bowMaster.shoot();
    }
}
