package co.pragra.spring.demo.springbasics;

import co.pragra.spring.demo.springbasics.game.CharacterRunner;
import co.pragra.spring.demo.springbasics.game.Eagle;
import co.pragra.spring.demo.springbasics.game.Elephant;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SpringBasicsApplication.class, args);

//		Elephant elephant =new Elephant();
//		Eagle eagle =new Eagle();
//
//		//CharacterRunner runner=new CharacterRunner(elephant);
//
//		      // OR
//
//		CharacterRunner runner=new CharacterRunner(eagle);
//		runner.run();

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(context.getBean("elephant"));

		System.out.println(context.getBean("CharacterRunner"));








	}

}
