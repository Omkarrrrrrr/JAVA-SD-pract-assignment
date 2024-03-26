import java.util.Arrays;
public class StringsAssignment3{
    public static void main(String[]args){

        // Question 1
        /*What is mutable String in java explain with example
        - Once if we create a String, on that String if we try to perform any operation and if
          those changes get reflected in the same object then such strings are called
          “Mutable String”.

           Example: StringBuffer, StringBuilder*/

        // Question 2
        /* Wap to reverse a String
        input="PWSKILLS"
        output="SLLIKSPW" */

        // String input = "PWSKILLS";
        // String reversed = reverseString(input);
        // System.out.println("Reversed string: " + reversed);

        // Question3
        /* Write a program to reverse a sentence while preserving the position
        input: "Think twice"
        output: "kniht eciwt" */

        /*String input = "Think twice";
        String reversedSentence = reverseSentence(input);
        System.out.println("Reversed sentence: " + reversedSentence);*/

        // Question 4
        // wap to sort a string alphabetically
        String input = "hello";
        String sortedString = sortString(input);
        System.out.println("Sorted string: " + sortedString);



    }
    // Q2
    //  public static String reverseString(String input) {
    //     // Reversing the input string
    //     return new StringBuilder(input).reverse().toString();

    // Q3
    /* public static String reverseSentence(String input) {
        // Split the input sentence into words
        String[] words = input.split("\\s+");

        // Reverse each word and append to a StringBuilder preserving the position
        StringBuilder reversedBuilder = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverseString(word);
            reversedBuilder.append(reversedWord).append(" ");
        }

        // Trim trailing space and return the reversed sentence
        return reversedBuilder.toString().trim();
    }

    public static String reverseString(String input) {
        // Reversing the input string
        return new StringBuilder(input).reverse().toString(); */

    public static String sortString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        return new String(charArray);
    }

    
}