package hello;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Prg extends ResourceSupport {

    private final String age;
    private final String name;

    @JsonCreator
    public Prg(@JsonProperty("name") String name, @JsonProperty("age") String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
}
