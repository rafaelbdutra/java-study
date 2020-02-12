package com.dutra.javastudy.java9;

import io.instrument.guitar.Guitar;
import io.instrument.guitar.impl.GibsonLesPaul;

import java.util.List;
import java.util.Set;

public class CollectionFactoryMethods {

    public static void main(String[] args) {
        Set<String> fruits = Set.of("apple", "banana", "grape", "strawberry");
        List<String> instruments = List.of("guitar", "drums", "bass", "guitar");

        final Guitar gibsonLesPaul = new GibsonLesPaul();
        gibsonLesPaul.play();

        assert fruits.size() == 4;
        assert instruments.size() == 4;
    }
}
