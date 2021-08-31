package com.quarkus.cucumber;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SomeBean {

    public void doSomething(){
        System.out.println("something...");
    }

}
