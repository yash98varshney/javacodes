package com.springpractice.springpractice.UsingAutoWired.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    
    private Engine engine;

    @Autowired
    public Car(Engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.turnOn();
    }

}
