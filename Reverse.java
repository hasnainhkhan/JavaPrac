///Write a Java program to reverse a word.

import java.util.*;

public class Reverse{
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();

            //word  trim

            word = word.trim();

             // Initialize an empty string for the reversed word
        String result = ""; 
        
        // Convert the word to a character array
        char[] ch = word.toCharArray();  
        
        // Reverse the word by iterating through the characters
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        
        // Print the reversed word
        System.out.println("Reverse word: " + result.trim());
      }
}