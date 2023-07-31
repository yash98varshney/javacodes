package com.springpractice.springpractice.UsingAutoWired.ConstructorInjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.springpractice.springpractice.UsingAutoWired.ConstructorInjection")
//@ComponentScan :- Scans for the pacjkage where @Component is located.

public class AppConfiguration {

}
