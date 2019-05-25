package com.springInAction.trials;

import lombok.AllArgsConstructor;

/**
 *
 */

@AllArgsConstructor
public class BraveKnight implements Knight {

    private Quest quest;

    public void embarkQuest() {
        quest.embark();
    }
}
