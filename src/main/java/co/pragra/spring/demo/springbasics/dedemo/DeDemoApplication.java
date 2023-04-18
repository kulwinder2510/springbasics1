package co.pragra.spring.demo.springbasics.dedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component

class Dependency1{}
@Component
class Dependency2{}
@Component
class MyMainClass{
    @Autowired
    Dependency1 dependency1;
    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("this is in dependency 1 setter");
        this.dependency1 = dependency1;
    }
    @Autowired
    public MyMainClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("this is constructor of dependency 1 and dependency 2");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    @Autowired

    Dependency2 dependency2;
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("this is in dependency 2 setter");
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "MyMainClass{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}
@Configuration
@ComponentScan

public class DeDemoApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DeDemoApplication.class);
        System.out.println(context.getBean(MyMainClass.class));
    }
}
