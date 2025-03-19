package CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class CustomSetCF {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Tony", 1));
        studentSet.add(new Student("Peter", 12));
        studentSet.add(new Student("Steve", 33));
        studentSet.add(new Student("Bruce", 1));

        System.out.println(studentSet);

        Student s1 = new Student("Natasha", 44);
        Student s2 = new Student("Clint", 44);

        System.out.println(s1.equals(s2)); // true
    }
}
