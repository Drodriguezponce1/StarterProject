package CH1_CH3.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    private String name;
    private int age;

    @Autowired
    private Dog dog;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){}

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dog getDog() {
        return this.dog;
    }

    @Override
    public String toString(){
        return "[ Name: " + this.getName() + ", Age: " + this.getAge() + ", Dog: " + this.getDog() + "]";
    }
}
