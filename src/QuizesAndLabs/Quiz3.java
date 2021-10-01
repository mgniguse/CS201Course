package QuizesAndLabs;

import java.util.Random;

public class Quiz3 {


        public static void main(String[] args) {
            genpass();

        }
        public static void genpass() {
            Random msgie = new Random();
            int generatePass = msgie.nextInt(90 - 65 + 1)+ 65;
            char upperCase =(char) generatePass;
            char loweCase =(char)(msgie.nextInt(122- 97 + 1)+ 97);
            int num = msgie.nextInt(10);
            char specialChar =(char)(msgie.nextInt(38-33+1)+33);
            System.out.println(upperCase +""+ loweCase +""+ num + ""+specialChar);

        }
    }



