package Lab8And9;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine();
        while(sentence!=""){
            Vowels.countVow(sentence);
            System.out.println("Enter your sentence");
            sentence = input.nextLine();
        }
    }
    public static void countVow(String sentence){
        int countI=0,countE=0,countO=0,countU=0,countA=0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.toLowerCase().charAt(i)=='i')
                countI++;
            else if(sentence.toLowerCase().charAt(i)=='e')
                countE++;
            else if(sentence.toLowerCase().charAt(i)=='o')
                countO++;
            else if(sentence.toLowerCase().charAt(i)=='u')
                countU++;
            else if(sentence.toLowerCase().charAt(i)=='a')
                countA++;
        }
        System.out.println("The vowels in the Sentence are: "+ "\n i: "+ countI+  "\n e: "+ countE+
                "  \n o: "+ countO+" \n u: "+ countU+" \n a: "+ countA);
    }

}
