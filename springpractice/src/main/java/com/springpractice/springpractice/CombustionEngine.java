package com.springpractice.springpractice;

public class CombustionEngine implements Engine{
    
    private Crankshaft crankshaft;
    private Camshaft camshaft;

    public CombustionEngine(Crankshaft crankshaft,Camshaft camshaft){
        this.crankshaft=crankshaft;
        this.camshaft=camshaft;
    }

    @Override
    public void turnOn(){
        System.out.println("Started combustion engine");
    }
}
