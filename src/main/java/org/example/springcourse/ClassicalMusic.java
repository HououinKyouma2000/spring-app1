package org.example.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music{
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my init");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroy");
    }


    @Override
    public String getSong() {
        return "Mozart";
    }
}
