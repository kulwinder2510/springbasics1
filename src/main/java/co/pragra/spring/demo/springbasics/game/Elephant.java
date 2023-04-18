package co.pragra.spring.demo.springbasics.game;

import org.springframework.context.annotation.Configuration;

@Configuration

public class Elephant implements CharacterConsole {
    public void move(){
        System.out.println("Elephant runs forward");
    }

    public void attack(){
        System.out.println("Elephant tosses objects");
    }

    public void cry(){
        System.out.println("Elephant trumpets");
    }
}
