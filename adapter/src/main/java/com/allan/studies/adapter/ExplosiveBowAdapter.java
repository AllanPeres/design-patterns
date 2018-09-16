package com.allan.studies.adapter;

public class ExplosiveBowAdapter implements Bow {

    private ExplosiveBow explosiveBow;

    public ExplosiveBowAdapter() {
        this.explosiveBow = new ExplosiveBow();
    }

    @Override
    public void shoot() {
        explosiveBow.shootExplosive();
    }
}
