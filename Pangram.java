//1.c Check if the input is pangram or not.

public class Pangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("It's a pangram.");
        } else {
            System.out.println("It's not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        int[] counts = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }

        for (int count : counts) {
            if (count == 0) {
                return false;
            }
        }

        return true;
    }
}