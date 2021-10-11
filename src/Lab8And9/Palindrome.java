package Lab8And9;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        while(word !=""){
            Palindrome.palindrome1(word);
            System.out.println("Enter your word");
            word=input.nextLine();
        }
    }
    public static void palindrome1 (String word){
        String word1 = "";
        for (int i=(word.length()-1) ; i >= 0 ; i--) {
            word1 +=(word.charAt(i));
        }
        if(word1.equalsIgnoreCase(word))
            System.out.println("It's a palindrome");
        else
            System.out.println("It's not a palindrome");
    }
}
