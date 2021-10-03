package Lab3;

import java.util.Scanner;

class Lab3Ques1 {
    public static void main(String[] args) {
        Scanner msgie = new Scanner(System.in);
        System.out.println(" Enter any first number");
        double B = msgie.nextDouble();
        System.out.println(" Enter any second number");
        double A = msgie.nextDouble();
        System.out.println(" Enter any third number");
        double C = msgie.nextDouble();
        double squareRoot=  Math.sqrt(Math.pow(B,2) + (4 *A*C));
        System.out.println("The Squared root of the numbers is: "+ squareRoot);


         //B) SquaredRoot  of Aa and Bb

        System.out.println("Enter a number for Aa");
        double Aa = msgie.nextDouble();
        System.out.println("Enter a number for Bb");
        double Bb = msgie.nextDouble();
        double squareRt=  Math.sqrt(Aa+ (4 *Math.pow(Bb,3)));
        System.out.println("Squared Root of Aa and Bb is: "+squareRt);


        //C)   CubeRoot of X and Y

        System.out.println("Enter any number for X");
        double X = msgie.nextDouble();
        System.out.println("Enter any number for Y");
        double Y = msgie.nextDouble();
        double cubeRoot=  Math.cbrt(X*Y);
        System.out.println("Cube Root of X and Y is: "+ cubeRoot);


        //D) Area of a circle

        System.out.println("Enter a radius of a circle please");
        double radiusOfTheCircle = msgie.nextDouble();
        double areaOfTheCircle = (Math.PI*Math.pow(radiusOfTheCircle,2));
        System.out.println("The area of a circle is: "+ areaOfTheCircle);

    }
}


