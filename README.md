# Started this project while reading "Spring Starts Here."

- I will try and make my own touch when it comes to some projects

## Chapter 1 - 3:

* I learned about creating context for Spring to use:
    * Using the `@Bean` annotation to create a bean
    * Using `@Component` to define a class as a Spring-managed component
    * Programmatically registering a bean later

* Importance of `@Autowired`:
    * `@Autowired` allows us to leverage IOC (Inversion of Control)
        * Inversion of Control is essential in Spring; we as programmers let Spring handle the object creation and
          wiring
    * Three ways to autowire:
        1. Constructor-based: most common way as it allows us to have a final instance variable
        2. Setter-based: mostly used when showing an example
        3. Field-based: read that it has more cons than pros

    - This is an example of constructor-based:
    ```java
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.stereotype.Component;
    
    @Component
    public class Person {
    
        private String name;
    
        private final Dog dog;
    
        @Autowired
        public Person(Dog dog) {this.dog = dog;}
    
        public void setName(String name) {this.name = name;}
    
        @Override
        public String toString() {
            return "[ Name: " + this.name + ", Dog: " + this.dog + "]"; 
        }
    }
    ```
