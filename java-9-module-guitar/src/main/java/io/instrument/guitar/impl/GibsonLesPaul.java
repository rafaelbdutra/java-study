package io.instrument.guitar.impl;

import io.instrument.guitar.Guitar;

public class GibsonLesPaul implements Guitar {

    private final String brand;
    private final String model;

    public GibsonLesPaul() {
        this.brand = "Gibson";
        this.model = "Les Paul";
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }
}
