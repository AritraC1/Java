package DSA.Strings;

public class Strings {
    public static void main(String[] args) {
        String name = "Tony";
        System.out.println(name);

        name = "Stark";
        System.out.println(name);

        // Accessing values
        System.out.println(name.charAt(0)); // prints S

        // performance
        String series = "";

        for (int i = 0; i<26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch;
        }
        System.out.println(series);
    }
}
