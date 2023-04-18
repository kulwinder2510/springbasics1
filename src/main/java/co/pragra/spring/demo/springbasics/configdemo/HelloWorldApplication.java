package co.pragra.spring.demo.springbasics.configdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApplication {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean("firstName"));
    }

}
