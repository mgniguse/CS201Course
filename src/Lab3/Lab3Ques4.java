package Lab3;

import java.util.Scanner;

public class Lab3Ques4 {


        public static final int CaloriesPerPoundOfBodyWeight = 19;

        public static void main(String[] args) {

            Scanner msgie = new Scanner(System.in);
            System.out.println("Enter your Weight");
            double bodyWeight = msgie.nextDouble();
            int numberOfCalories = (int) bodyWeight * CaloriesPerPoundOfBodyWeight;
            System.out.println("The number of Calories that you needs in one day is: " + numberOfCalories);

        }
    }


