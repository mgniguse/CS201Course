package QuizesAndLabs;

import java.time.YearMonth;
import java.util.Scanner;

public class Lab3Ques5 {

        public static void main(String[] args) {

        Scanner msgie = new Scanner(System.in);
            System.out.println("Enter the year you were born ");
            int year  = msgie.nextInt();
            int currentYear = YearMonth.now().getYear();
            int currentAge = currentYear - year;
            System.out.println("You were born in "+ year +" and you are going to be " + currentAge + " years old this year.");
            msgie.close();
        }
    }

