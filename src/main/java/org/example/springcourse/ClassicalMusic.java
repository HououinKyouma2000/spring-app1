package org.example.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*@Scope("prototype")*/
/*@Scope("singleton")*/
@Component
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
