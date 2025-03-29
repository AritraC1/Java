package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCF {
    public static void main(String[] args) {

        // HASHMAP
        // Time Complexity: O(1)
        Map<String, String> countryCodes = new HashMap<>();

        countryCodes.put("in", "India");
        countryCodes.put("us", "United States");
        countryCodes.put("br", "Brazil");
        countryCodes.put("es", "Spain");

        System.out.println(countryCodes);
        System.out.println(countryCodes.containsValue("India")); // boolean

        if(countryCodes.containsKey("us")){
            System.out.println("Contains Key");
        }

        if (!countryCodes.containsValue("France")) {
            System.out.println("Doesn't Contain Value");
        }

        // countryCodes.putIfAbsent("in", "India");

        for(Map.Entry<String, String> e:countryCodes.entrySet()){
            System.out.println(e);
        }

        for (String key: countryCodes.keySet()) {
            System.out.println(key);
        }

        System.out.println();

        // TREEMAP: Map using BST - Binary Search Tree (Already Sorted)
        Map<String, Integer> numbers = new TreeMap<>();

        // Here the sorting will be according to the alphabetical order like a dictionary
        // Sorting will be according to the keys
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Four", 4);
        numbers.put("Three", 3);
        numbers.put("Five", 5);

        System.out.println(numbers);

        numbers.remove("Four");
        System.out.println(numbers);
    }
}
