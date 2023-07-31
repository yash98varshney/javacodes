package com.springpractice.springpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    
    @Bean
    public Car car(Engine engine){
        return new Car(engine);
    }

    @Bean
    public Engine engine(Crankshaft crankshaft,Camshaft camshaft){
        return new CombustionEngine(crankshaft, camshaft);
    }

    @Bean
    public Crankshaft crankshaft(){
        return new Crankshaft();
    }

    @Bean
    public Camshaft camshaft(){
        return new Camshaft();
    }
}
