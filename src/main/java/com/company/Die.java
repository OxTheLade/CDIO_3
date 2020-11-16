package com.company;

import java.util.Random;

public class Die {

    public int diceNumber;
    private final Random random = new Random();
    private final int MIN;
    private final int MAX;

    /* Konstruktør til Die klassen, hvor man skal angive en MIN og MAX værdi af terningen. Fx 1 til 6 for en normal 6
    sidet terning */

    public Die(int MIN, int MAX) {
        this.MIN = MIN;
        this.MAX = MAX;
    }

    // Metode der slår med en enkelt terning
    private void rollDice() {
        diceNumber = random.nextInt((MAX - MIN + 1)) + MIN;
    }

    /* Metode der bruger en eller flere instancer af Die klassen, som ruller  med terninger via rollDice() metoden fra
       Die klassen. Metoden accepterer flere argumenter. */
    public int diceTurn(Die... args) {

        int sum = 0;
        for(Die arg : args) {
            arg.rollDice();
            sum += arg.diceNumber;
        }

        return sum;
    }

    // Metode der returner summen af to terninger
//    public static int getSum(int dice1, int dice2) {
//        return dice1 + dice2;
//    }


}
