package com.springInAction.trials;

import com.springInAction.trials.interfaces.Philosiphy;

/**
 *
 */
public class Quote implements Philosiphy {

    String quote = " One can never forget the Past," +
            "\n but one can always start living in the Present" +
            "\n and hope for the Future";

    public void philosiphise() {
        System.out.println(quote);
    }
}
