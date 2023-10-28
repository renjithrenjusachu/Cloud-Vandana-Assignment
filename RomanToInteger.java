//1 b. Roman numeral to integer value


import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral (I to X): ");
        String romanNumeral = scanner.nextLine();
        
        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + result);
        
        scanner.close();
    }

    public static int romanToInteger(String s) {
        switch (s.toUpperCase()) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                return 0; 
        }
    }
}
