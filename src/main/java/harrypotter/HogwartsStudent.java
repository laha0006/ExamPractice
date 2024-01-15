package harrypotter;

import java.util.ArrayList;
import java.util.List;

public class HogwartsStudent implements Comparable {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean setHouse(String house) {
        ArrayList<String> houses = new ArrayList<>(List.of("gryffindor","hufflepuff","ravenclaw","slytherin")) ;
        if (!houses.contains(house.toLowerCase())) return false;
        this.house = house;
        return true;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Object o) {
        HogwartsStudent student = (HogwartsStudent) o;
        return lastName.compareTo(student.getLastName());
    }


}
