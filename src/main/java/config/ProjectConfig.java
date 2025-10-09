package config;

import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Person person(){
        Person p = new Person();
        p.setName("Danny");
        p.setAge(99);
        return p;
    }
}
