import java.util.Arrays;
public class StringsAssg3{
    public static void main(String[]args){
        
        
        // Question 1
        // WAP to remove duplicates from a string

        // String str = "Assignment";
        // String result = removeDuplicates(str);
        // System.out.println("String after removing duplicates: " + result);



        // Question 3
        // wap to check if "2552" is palidrome or not
        // String str1 = "2552";
        // String str2 = " ";

        //  int number = 2552;
        
        // if (isPalindrome(number)) {
        //     System.out.println(number + " is a palindrome.");
        // } else {
        //     System.out.println(number + " is not a palindrome.");
        // }

        // Question 4
        // WAP to count the number of consanants,vowels,special characters in a string in java
        // String str3 = "Hello! How are you?";
        // countCharacters(str3);

        // Question 5
        // Wap to implement anagram checking least inbuilt methods used
         

        String str4="eat";
        String str5="tea";

        char []arr1=str4.toCharArray();
        char []arr2=str5.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        if(Arrays.equals(arr1,arr2))
        {
           System.out.println("the word is Anagram");
        }
        else
        {
            System.out.println("The word is not Anagram");
        }
    }

    }
    // Q1
    // public static String removeDuplicates(String str) {
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < str.length(); i++) {
    //         char currentChar = str.charAt(i);
    //         if (sb.indexOf(String.valueOf(currentChar)) == -1) {
    //             sb.append(currentChar);
    //         }
    //     }
    //     return sb.toString();
    // }


    //Q3
    // public static boolean isPalindrome(int number) {
    //     int originalNumber = number;
    //     int reverse = 0;
        
    //     // Reverse the number
    //     while (number != 0) {
    //         int remainder = number % 10;
    //         reverse = reverse * 10 + remainder;
    //         number /= 10;
    //     }
        
    //     // Check if the original number is equal to its reverse
    //     return originalNumber == reverse;
    // }

    //Q4
    //   public static void countCharacters(String str3) {
    //     int vowels = 0, consonants = 0, specials = 0;

    //     str3 = str3.toLowerCase(); // Convert the string to lowercase for easier comparison

    //     for (int i = 0; i < str3.length(); i++) {
    //         char ch = str3.charAt(i);

    //         if (ch >= 'a' && ch <= 'z') {
    //             // Check if the character is a vowel
    //             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    //                 vowels++;
    //             } else {
    //                 consonants++;
    //             }
    //         } else if (ch != ' ') {
    //             // Check if the character is a special character
    //             specials++;
    //         }
    //     }

    //     System.out.println("Number of vowels: " + vowels);
    //     System.out.println("Number of consonants: " + consonants);
    //     System.out.println("Number of special characters: " + specials);
    // }


    

