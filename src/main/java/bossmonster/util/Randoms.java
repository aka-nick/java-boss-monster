package bossmonster.util;

import java.util.Random;

public class Randoms {

    public static int make(int startInclusive, int endExclusive) {
        return new Random()
                .nextInt(endExclusive - startInclusive + 1) + startInclusive;
    }

}
