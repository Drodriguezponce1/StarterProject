package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Driver {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        Person d = context.getBean("danny", Person.class);
        String random = context.getBean("hello", String.class);

        System.out.println(random);
        System.out.println(p);
        System.out.println(d);

        // This was essential for when you do not create an object of Dog in the config file, because it had context.
        Dog dd = context.getBean(Dog.class);
        dd.setName("Lucky");

        System.out.println(dd);

        //Trying to register a bean
        // this is very interesting, but feel like it could be better, im speaking in terms of making more Dog objs than
        // one needs
        Dog dog = new Dog();
        dog.setName("Rodger");

        Supplier<Dog> DogSupplier = () -> dog;

        context.registerBean("rodger", Dog.class, DogSupplier);
        Dog ddd = context.getBean("rodger", Dog.class);

        dog.setName("regdor");

        /* Wanted to try and replicate the above code using lesser lines of code:
         * context.registerBean("practice", Dog.class, () -> new Dog());
         * ddd = context.getBean("practice", Dog.class);
         * ddd.setName("practice");
         * */

        System.out.println(ddd);

    }
}
