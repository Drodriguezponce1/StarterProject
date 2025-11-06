package CH1_CH3.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Persona {

    private String name;

    private final Dog dog;

    @Autowired
    public Persona(@Qualifier("conch") Dog dog) {
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
