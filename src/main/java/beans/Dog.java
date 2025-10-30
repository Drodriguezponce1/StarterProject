package beans;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[This dog is named: " + this.name + "]";
    }
}
