package QuizesAndLabs;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {


        public static void main(String[] args) {
            Scanner msgie = new Scanner(System.in);
            Random ram = new Random();
            System.out.println("Enter a Number");
            int x = msgie.nextInt();
            for (int i = 0; i< x ; i++) {
                int dom = ram.nextInt(4-1+1)+1;

                if (dom == 0)
                    System.out.println("A");
                if (dom == 1)
                    System.out.println("B");
                if (dom == 2)
                    System.out.println("C");
                else System.out.println("D");

            }


        }

    }


