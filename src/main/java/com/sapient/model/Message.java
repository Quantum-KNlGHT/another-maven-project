package com.sapient.model;

 

public class Message {
    private String greeting;
    public Message() {

    }
    public Message(String greeting) {
        super();
        this.greeting = greeting;
    }
    public String getGreeting() {
        return greeting;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

}