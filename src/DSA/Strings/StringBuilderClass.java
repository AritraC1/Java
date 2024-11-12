package DSA.Strings;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<26; i++) {
            char ch = (char)('a' + i);
            // Add
            sb.append(ch); // mutable
        }

        System.out.println(sb);

        // Deletes character at index no
        sb.deleteCharAt(0);
        System.out.println(sb);

        // Reverses the string
        sb.reverse();
        System.out.println(sb);
    }
}
