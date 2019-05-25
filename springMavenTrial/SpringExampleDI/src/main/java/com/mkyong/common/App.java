package com.mkyong.common;

import com.mkyong.output.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"Spring-Commons.xml"});

        OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
        output.generateOutput();

    }
}
