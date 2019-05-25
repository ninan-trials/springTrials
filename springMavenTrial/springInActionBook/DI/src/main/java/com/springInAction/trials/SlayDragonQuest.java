package com.springInAction.trials;

/**
 *
 */
public class SlayDragonQuest implements Quest {

    private final String goal = "Slay A Dragon";

    public void embark() {
        System.out.println("Knight is on a quest to " + this.goal);
    }
}
