package CollectionsFramework;

import java.util.Stack;

public class StackCF {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Tiger");
        animals.push("Elephant");
        animals.push("Lion");
        animals.push("Deer");
        animals.push("Monkey");

        System.out.println("stack: " + animals);
        System.out.println(animals.peek()); // checks the top element
        System.out.println(animals.pop()); // removes the top element
        System.out.println("stack: " + animals);
        System.out.println(animals.peek());
    }
}
