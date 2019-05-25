package com.springInAction.trials;

import com.springInAction.trials.interfaces.Performer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 */
@AllArgsConstructor
@NoArgsConstructor
public class Juggler implements Performer {
    private int balls;

    public void perform() {
        System.out.println(" Juggling " + balls + " balls");
    }
}
