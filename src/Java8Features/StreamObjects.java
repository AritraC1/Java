package Java8Features;

import java.util.stream.Stream;

public class StreamObjects {
    public static void main(String[] args) {

        // Stream API: Collection Process

        // Blank
        Stream<Object> emptyStream = Stream.empty();

        // Array, Object, Collection
        String[] name = {"Tony", "Stark", "Peter", "Pan"};

        Stream<String> stream = Stream.of(name);
        stream.forEach(e -> { // same as: stream.forEach(System.out::println);
            System.out.println(e);
        });

        // Builder
        Stream<Object> streamBuilder = Stream.builder().build();
    }
}
