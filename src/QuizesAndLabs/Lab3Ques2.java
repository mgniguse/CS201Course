package QuizesAndLabs;

import java.util.Scanner;

public class Lab3Ques2 {

        public static void main(String[] args) {

            Scanner msgie = new Scanner(System.in);
            System.out.println("Enter the centimeters that you want to convert to feet & inches");
            double Cmeter = msgie.nextDouble();

            double Inch = Cmeter/ 2.54;
            int  ft =  (int)Inch/ 12;
            int in = (int) Inch % 12;
            System.out.println("The converted centimeter is : "+ ft+" feet & "+ in+" inches.");

        }
    }

