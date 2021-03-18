package com.testinium;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void emreControlTest(){
        App app = new App();
        assertTrue(app.emre("emregorgulu","198900"));


    }
}
