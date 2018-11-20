package forms;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by rexfordnana on 9/9/18.
 */
public class PersonForm {

    @NotNull
    @Size(min = 2, max = 32)
    String name;

    @NotNull
    @Min(18)
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person(Name : " + this.name + " Age : " + this.age+ ")";
    }
}
