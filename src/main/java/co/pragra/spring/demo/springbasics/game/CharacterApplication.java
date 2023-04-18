package co.pragra.spring.demo.springbasics.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("co.pragra.spring.demo.springbasics.game" )

public class CharacterApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CharacterApplication.class);
        context.getBean(CharacterRunner.class).run();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
