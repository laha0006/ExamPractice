package harrypotter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        HogwartsStudent harryA = new HogwartsStudent("Harry","Aaaaa");
        HogwartsStudent harryB = new HogwartsStudent("Harry","Bbbbb");
        HogwartsStudent harryC = new HogwartsStudent("Harry","Ccccc");
        ArrayList<HogwartsStudent> students = new ArrayList<>();
        students.add(harryB);
        students.add(harryC);
        students.add(harryA);
        Collections.sort(students);
        for(HogwartsStudent student : students) {
            System.out.println(student.getLastName());
        }
    }
}
