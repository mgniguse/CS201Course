package Lab3;

import java.util.Scanner;

public class Lab3Ques3 {

        public static  final double  ConstantNumber = 1.8;
        public static  final int  ConstantNumber1 = 32;
        public static void main(String[] args) {

            Scanner msgie = new Scanner(System.in);
            System.out.println("Enter the Degree Celsius temperature that you want to convert  to degrees Fahrenheit.");
            double degreeCel = msgie.nextDouble();
            double degreeFahr = ConstantNumber * degreeCel + ConstantNumber1;
            System.out.println("The temperature is " +degreeFahr +" degree Fahrenheit.");
            msgie.close();
        }
    }

