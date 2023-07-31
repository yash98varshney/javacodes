package com.springpractice.springpractice.UsingAutoWired.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Combustion Engine")
public class CombustionEngine implements Engine{
    
    private Camshaft camshaft;
    private Crankshaft crankshaft;

    @Autowired
    public CombustionEngine(Crankshaft crankshaft,Camshaft camshaft){
        this.camshaft=camshaft;
        this.crankshaft=crankshaft;
    }

    @Override
    public void turnOn(){
        System.out.println("Started combustion engine");
    }

}
