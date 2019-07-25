package de.elliepotato.sleepy.util;

import de.elliepotato.sleepy.Sleepy;

import java.util.Optional;

/**
 * @author Ellie :: 24/07/2019
 */
public class NumberTools {

    public static Optional<Integer> tryParse (String value) {

        try {
            return Optional.of(Integer.parseInt(value));
        } catch (NumberFormatException ignored) {
        }

        return Optional.empty();
    }

    public static boolean equals (int a, int b) {
        return a == b;
    }

    public static double halfFloor (int x) {
        Sleepy.debug("x / 2 = " + (x / 2));
        Sleepy.debug("floor ans " + Math.floor(x / 2));
        return Math.floor (x / 2);
    }

}
