package Lab5;

import java.util.Scanner;

public class PowerOf10 {
    public static void main(String[] args) {
        int num;
        Scanner msgie = new Scanner(System.in);
        System.out.println("Enter the power of 10");
        num = msgie.nextInt();
        Math.pow (10,num);
        if (num == 6)
            System.out.println(" one Million");
        else if (num == 9)
            System.out.println(" one Billion");
        else if (num == 12)
            System.out.println(" one Trillion");
        else if (num == 15)
            System.out.println(" one Quadrillion");
        else if (num == 18)
            System.out.println(" one Quintillion");
        else if (num == 21)
            System.out.println(" one Sextillion");
        else if (num == 30)
            System.out.println(" one Nonillion");
        else if (num == 100)
            System.out.println(" one Googol");
        else
            System.out.println(" out of range");
    }

}
