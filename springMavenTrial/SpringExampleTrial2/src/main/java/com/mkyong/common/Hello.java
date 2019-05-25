package com.mkyong.common;

import lombok.Setter;

/**
 *
 */
public class Hello {

    @Setter
    String name;

    public void print() {
        System.out.println("Hello " + name);
    }
}
