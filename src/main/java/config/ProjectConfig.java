package config;

import beans.Dog;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    /* I have learned that this can be automated later once we get to the Spring sections.
     *  Spring now has a @SpringApplication that handles most of this, but this is really cool
     *
     *
     *  A Bean is essentially a class or object defined to be under the 'context' of Spring
     * */

    @Bean("lol")
    @Primary
    Person person(){
        Person p = new Person();
        p.setName("Danny");
        p.setAge(99);
        return p;
    }

    @Bean
    Person danny() {
        return new Person("Danny", 77);
    }

    @Bean
    String randomWord() {
        return "Lalalalala";
    }

    @Bean
    String hello() {
        return "hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }

    @Bean
    @Primary
    Dog conch() {
        Dog d = new Dog();
        d.setName("YKCUL");

        return d;
    }

    @Bean("ynnad")
    Person ynnad() {
        Person ynnad = new Person("YnnaD", 99);

        ynnad.setDog(conch());
        return ynnad;

    }

    @Bean("figaro")
    Person figaro(Dog dog) {
        Person figaro = new Person("Figaro", 888);
        Dog doom = new Dog();
        doom.setName("MF DOOM");
        figaro.setDog(doom);

        return figaro;
    }
}
