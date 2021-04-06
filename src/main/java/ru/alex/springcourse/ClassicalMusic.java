package ru.alex.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class ClassicalMusic implements Music{
    private ClassicalMusic() {}

    private static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization with annotation @PostConstruct...");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction with annotation @PreDestroy!");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
