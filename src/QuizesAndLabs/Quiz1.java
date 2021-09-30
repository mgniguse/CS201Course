package QuizesAndLabs;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {

        String fName;
        String lName;

        Scanner msgie = new Scanner(System.in);

        System.out.println("Enter your First Name.");
        fName = msgie.next();
        System.out.println("Enter your Last Name.");
        lName = msgie.next();
       System.out.println(fName.charAt(0)+ lName.substring(0)+"@miu.edu");

    }
}
