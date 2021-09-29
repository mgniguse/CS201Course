package QuizesAndLabs;

import java.util.Scanner;

public class Lab2Ques3 {
    public static void main(String[] args) {
        String x;

        Scanner msgie = new Scanner(System.in);
        System.out.println("Enter any word");
        x = msgie.next();
        System.out.println(x.charAt(x.length()/2));

    }
}
