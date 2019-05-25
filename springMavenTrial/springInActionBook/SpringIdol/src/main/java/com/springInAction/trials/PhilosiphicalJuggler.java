package com.springInAction.trials;

/**
 *
 */

public class PhilosiphicalJuggler extends Juggler{
    private Quote quote;

    public PhilosiphicalJuggler(int balls, Quote quote) {
        super(balls);
        this.quote = quote;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println(" Let me give you a few words of advice: ");
        quote.philosiphise();
    }
}
