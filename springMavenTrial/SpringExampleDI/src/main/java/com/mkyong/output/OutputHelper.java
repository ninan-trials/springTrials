package com.mkyong.output;

import lombok.Setter;

/**
 *
 */
public class OutputHelper {

    @Setter
    OutputGenerator generator;

    public void generateOutput(){
        generator.generateOutput();
    }
}
