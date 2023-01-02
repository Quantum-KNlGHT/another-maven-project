package com.sapient.model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

 


public class MessageTest {
    Message message=null;

 

    @Before
    public void setUp() throws Exception {
        message=new Message("Good Morning!");
    }

 

    @After
    public void tearDown() throws Exception {
        message=null;
    }

 

    @Test
    public void testMessageString() {
        message= new Message("Hello World");
        assertEquals("Hello World",message.getGreeting());
    }

 

    @Test
    public void testGetGreeting() {
        assertEquals("Good Morning!",message.getGreeting());
    }

 

    @Test
    public void testSetGreeting() {
        message.setGreeting("Good Day!");
        assertEquals("Good Day!",message.getGreeting());
    }

 

}