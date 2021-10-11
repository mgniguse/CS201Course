package Lab8And9;

import java.util.Scanner;

public class UpperCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine();
        while(sentence !="") {
            UpperCase.upperC(sentence);
            System.out.println("Enter your sentence");
            sentence = input.nextLine();
        }
    }
    public static void upperC(String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 65; j < 90; j++) {
                if (word.charAt(i) == (char) (j))
                    counter++;
            }

        }

        System.out.println("There are " + counter + " Uppercases in your Sentence.");
    }

}
