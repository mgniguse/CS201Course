package Lab7;

import java.util.Scanner;

public class Ques4 {
    public static boolean primeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
                return true;
    }

    public static void main(String[] args) {
                Scanner msgie = new Scanner(System.in);
                while (true){
                    System.out.println("Enter a prime number");
                    int prime = msgie.nextInt();
                if (prime < 0){
                    System.out.println("Stop");
                    break;
                }
                if( primeNumber(prime)){
                    System.out.println(" It's Prime");
                }else
                    System.out.println("It's not a prime");

                }
    }
}

