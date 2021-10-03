package Lab2;

import java.util.Scanner;

public class Lab2Ques1 {
    public static void main(String[] args) {
        String fName;
        String mName;
        String lName;

        Scanner msgie = new Scanner(System.in);
        System.out.println("Enter your Fist Name: ");
        fName = msgie.next();
        System.out.println("Enter your Middle Name: ");
        mName = msgie.next();
        System.out.println("Enter your LAst name: ");
        lName = msgie.next();
        System.out.println(fName +" " +mName.charAt(0)+"."+" " +lName);
    }
}
