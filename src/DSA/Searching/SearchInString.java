package DSA.Searching;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Tony Stark";
        char target = 't'; // true
        // char target = 'b'; // false

        System.out.println(search(name, target));
    }

    static boolean search(String str, char target){
        if (str.isEmpty()) { // similar to -> str.length() == 0
            return false;
        }

        for (int i = 0; i< str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}