package co.pragra.spring.demo.springbasics.configdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age){}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Emily";
    }
    @Bean
    public int age(){
        return 34;
    }

    @Bean
    public Person person(){
        return new Person("Sam", 29);
    }
//    @Bean
//    @Primary
//    public Person newperson(){
//        return new Person(name(), age());
//    }
    @Bean(name="firstName")
    @Primary
    public Person newperson(){
        return new Person(name(), age());
    }

}

