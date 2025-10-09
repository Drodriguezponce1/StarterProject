package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        Person d = context.getBean("danny", Person.class);
        String random = context.getBean("hello", String.class);

        System.out.println(random);
        System.out.println(p);
        System.out.println(d);

        Dog dd = context.getBean(Dog.class);
        dd.setName("Lucky");

        System.out.println(dd);
    }
}
