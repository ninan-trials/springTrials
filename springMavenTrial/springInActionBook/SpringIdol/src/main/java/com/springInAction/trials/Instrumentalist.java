package com.springInAction.trials;

import com.springInAction.trials.interfaces.Performer;
import lombok.Getter;
import lombok.Setter;

/**
 *
 */
public class Instrumentalist implements Performer{

    @Setter
    Instrument instrument;

    @Setter
    @Getter
    String song;



    public void perform() {
        System.out.println("\n\nI am gonna sing y'all a Song: "+ song);
        instrument.play();
    }
}
