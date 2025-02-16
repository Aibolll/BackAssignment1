package com.example;

import org.springframework.stereotype.Component;

@Component
public class Person {
    public void sayHello() {
        System.out.println("Hello from Person!");
    }
}
