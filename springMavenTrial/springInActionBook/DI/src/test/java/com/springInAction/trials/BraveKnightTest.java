package com.springInAction.trials;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 *
 */
public class BraveKnightTest extends TestCase {

    @Mock
    Quest knightsQuest;

    public void setUp() throws Exception {
        initMocks(this);
    }

    public void testKnightShouldEmbarkOnQuest() throws Exception {
        BraveKnight knight = new BraveKnight(knightsQuest);
        knight.embarkQuest();

        verify(knightsQuest, times(1)).embark();

    }
}