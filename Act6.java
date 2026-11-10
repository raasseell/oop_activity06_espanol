
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Act6{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String strng = sc.nextLine();

        System.out.println("\nPattern Matching Results:");

        if (strng.matches("[0-9]+")) {
            System.out.println("Digits only: Valid");
        } else {
            System.out.println("Digits only: Invalid");
        }

        if (Pattern.matches("[a-zA-Z]+", strng)) {
            System.out.println("Letters only: Valid");
        } else {
            System.out.println("Letters only: Invalid");
        }

        Pattern p1 = Pattern.compile("(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]+");
        Matcher m1 = p1.matcher(strng);

        if (m1.matches()) {
            System.out.println("Letters and numbers: Valid");
        } else {
            System.out.println("Letters and numbers: Invalid");
        }

        Pattern p2 = Pattern.compile("^Java.*");
        Matcher m2 = p2.matcher(strng);

        if (m2.matches()) {
            System.out.println("Starts with Java: Valid");
        } else {
            System.out.println("Starts with Java: Invalid");
        }

        if (strng.matches(".*\\.com$")) {
            System.out.println("Ends with .com: Valid");
        } else {
            System.out.println("Ends with .com: Invalid");
        }

        if (Pattern.matches("[0-9]{5}", strng)) {
            System.out.println("Exactly 5 digits: Valid");
        } else {
            System.out.println("Exactly 5 digits: Invalid");
        }

        if (strng.matches(".{8,}")) {
            System.out.println("At least 8 characters: Valid");
        } else {
            System.out.println("At least 8 characters: Invalid");
        }

        Pattern p3 = Pattern.compile("\\s");
        Matcher m3 = p3.matcher(strng);

        if (m3.find()) {
            System.out.println("Contains whitespace: Valid");
        } else {
            System.out.println("Contains whitespace: Invalid");
        }

        sc.close();
    }
}
