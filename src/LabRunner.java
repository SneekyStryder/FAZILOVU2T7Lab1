import java.util.Scanner;

public class LabRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String string1 = scan.nextLine();
        System.out.println("String length: " + string1.length());
        System.out.println("First half: " + string1.substring(0,(string1.length() / 2)) + "\n" + "Second half: " + string1.substring(string1.length() / 2));
        System.out.print("Enter second string: ");
        String string2 = scan.nextLine();

        if (string1.length() > string2.length()) {
            System.out.println(string1 + " is longer");
        }
        else if (string1.length() == string2.length()) {
            System.out.println("Both strings have the same length");
        }
        else {
            System.out.println(string2 + " is longer");
        }


        if (string1.compareTo(string2) > 0) {
            System.out.println(string2 + " is first alphabetically");
        }
        else if (string1.equals(string2)) {
            System.out.println("Both strings have the exact same characters");
        }
        else {
            System.out.println(string1 + " is first alphabetically");
        }


        if (string1.indexOf(string2) >= 0) {
            System.out.println(string2 + " is found in " + string1 + " at index " + string1.indexOf(string2));
        }
        else {
            System.out.println(string2 + " is NOT found in " + string1);
        }


    }
}
