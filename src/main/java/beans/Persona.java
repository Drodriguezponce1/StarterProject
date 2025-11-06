package beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persona {

    private String name;

    private final Dog dog;

    @Autowired
    public Persona(Dog dog) {
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Yo soy persona: " + this.name + ", y tengo una mascota llamado " + this.dog;
    }


}
