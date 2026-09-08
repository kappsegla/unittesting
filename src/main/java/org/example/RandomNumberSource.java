package org.example;

import java.util.Random;

public class RandomNumberSource implements NumberSource {
    private final Random random = new Random();

    @Override
    public int getNumber() {
        return random.nextInt(10); //0-9
    }
}
