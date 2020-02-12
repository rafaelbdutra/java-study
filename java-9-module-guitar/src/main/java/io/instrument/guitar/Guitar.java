package io.instrument.guitar;

public interface Guitar {

    String getBrand();

    String getModel();

    default void play() {
        System.out.println(String.format("I'm playing a %s %s 🎸", getBrand(), getModel()));
    }
}
