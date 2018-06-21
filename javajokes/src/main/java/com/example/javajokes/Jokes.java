package com.example.javajokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {

    private List<String> mJokes;
    private Random mRandom;

    public Jokes() {
        mJokes = new ArrayList<>();
        mJokes.add("I was walking with my friend who gets harassed a lot, because she has these huge tits. She has the kind of tits that men need time with, like they have questions. They need help processing them.");
        mJokes.add("Q: How are blondes and computers similar?\n" +
                "\n" +
                "A: You never appreciate them until they go down on you.");
        mJokes.add("Q: Why doesn't Santa have any children?\n" +
                "\n" +
                "A: He only comes once a year -- and when he does, it's down a chimney.");
        mJokes.add("I need you to adjust my hose bibb.");
        mJokes.add("The cops must be after you because it's illegal to look that good.");
        mJokes.add("I've got something you can take up the chain.");
        mJokes.add("Q: Why did the mirror have holes in it?\n" +
                "\n" +
                "A: A moron kept trying to shoot himself.");
        mJokes.add("Q: What do you call a bunch of blondes standing ear to ear?\n" +
                "\n" +
                "A: A wind tunnel.");
        mJokes.add("Q: Why did the blonde run with the bike?\n" +
                "\n" +
                "A: It was going too fast for her to get on.");

        mRandom = new Random();
    }

    public List<String> getmJokes() {
        return mJokes;
    }

    public String getRandomJoke() {
        String randomJoke = mJokes.get(mRandom.nextInt(mJokes.size()));
        return randomJoke;
    }
}
