import java.util.Scanner;

public class StringsAssg2 {
    public static void main(String[] args) {

        // Q1) Write a simple string program to take input from user
        Scanner sc = new Scanner(System.in); // scanner obj to read input from user

        System.out.println("Enter a string: ");// prompting user to input a string
        String userInput = sc.nextLine(); // reading input provided by user

        System.out.println("you entered: " + userInput);

        // Q2) How do you concatenate two strings in java ? give an example
        // In Java, you can concatenate two strings using the + operator or the concat()
        // method.
        // ex1 : Using the + operator:
        String str1 = "Pw";
        String str2 = " Skills";

        // Concatenating using the + operator
        String result = str1 + str2;

        System.out.println(result);

        // ex2: using concat() method:
        String str3 = "Hello";
        String str4 = " World";

        // Concatenating using the concat() method
        String result1 = str3.concat(str4);

        System.out.println(result1);

        // Q3 How do you find length of string in java ? give an example
        // We can find legth of string by usig length() method
        String str5 = "Welcome all!";

        // Finding the length of the string
        int length = str5.length();

        System.out.println("Length of the string: " + length);

        // Q4 How do you compare two strings in java ? give an example
        // 1)----Using the equals() method for equality comparison:
        // Ex:

        String str6 = "Hello";
        String str7 = "Hello";

        System.out.println(str6.equals(str7));

        // 2)----Using the == operator:
        System.out.println(str6 == str7);

        // Q5)Write a program to find a length of string "refrigerator"

        String str8 = "refrigerator";

        int length1 = str8.length();
        System.out.println(length1);

        // 6) Write a program to check if the letter "e" is in the word "Umbrella"

        String str9 = "Umbrella";

        boolean containsE = false;
        for (int i = 0; i < str9.length(); i++) {
            if (str9.charAt(i) == 'e') {
                containsE = true;
                break;
            }
        }

        if (containsE) {
            System.out.println("The word \"" + str9 + "\" contains the letter 'e'.");
        } else {
            System.out.println("The word \"" + str9 + "\" does not contain the letter 'e'.");
        }

        // Q7. Write a program to delete all consanants from the string "Hello,have a
        // good day"

        String inputString = "Hello, have a good day";
        // Remove consonants and create a new string with only vowels
        String vowelsOnly = removeConsonants(inputString);

        // Print the result
        System.out.println("Original string: " + inputString);
        System.out.println("String with only vowels: " + vowelsOnly);
    }

    public static String removeConsonants(String input) {
        // Define a string to store vowels
        String vowels = "aeiouAEIOU";

        // Create a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Iterate through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (vowels.indexOf(ch) != -1) {
                // If it's a vowel, append it to the result string
                result.append(ch);
            }
        }

        // Convert StringBuilder to String and return
        return result.toString();
    }
}
