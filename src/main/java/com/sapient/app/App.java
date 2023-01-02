package com.sapient.app;

import com.sapient.model.Message;

public class App {
    public static void main(String[] args) {
        Message message = new Message("Hello world!");
        System.out.println(message.getGreeting());
    }
}