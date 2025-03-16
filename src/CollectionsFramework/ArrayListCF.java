package CollectionsFramework;

import java.util.ArrayList;

// ArrayList
public class ArrayListCF {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>(); // empty arraylist
        studentList.add("Tony");
        studentList.add("Steve");
        studentList.add("Fury");
        // studentList.add(78); // will only take string values

        System.out.println(studentList);

        // More about Arraylist in: https://github.com/AritraC1/Java/blob/master/src/DSA/Arrays/ArrayLists.java
    }
}
