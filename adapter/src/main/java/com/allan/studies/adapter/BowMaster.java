package com.allan.studies.adapter;

public class BowMaster {

    private Bow bow;

    public BowMaster() {
    }

    public BowMaster(Bow bow) {
        this.bow = bow;
    }

    public void setBow(Bow bow) {
        this.bow = bow;
    }

    public void shoot() {
        bow.shoot();
    }
}
