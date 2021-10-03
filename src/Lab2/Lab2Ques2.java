package Lab2;

import java.util.Scanner;

public class Lab2Ques2 {
    public static void main(String[] args) {
        String x;
        Scanner msgie = new Scanner(System.in);

        System.out.println("Enter any words");
        x = msgie.nextLine();
        System.out.println(x.length());
        System.out.println(x.charAt(0));
        System.out.println(x.charAt(x.length()-1));

    }
}
