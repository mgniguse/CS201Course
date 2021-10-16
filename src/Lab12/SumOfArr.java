package Lab12;

import java.util.Scanner;

public class SumOfArr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = input.nextInt();
        int x[] = new int[n];
        System.out.println("Enter " + n + " numbers");
        for(int i = 0; i < n; i++){
            x[i] = input.nextInt();
            addition(x, 0, n, 0);
        }
    }
    public static void addition(int y[],int indv,int num,int total) {
        if (indv != num) {
            total = total + y[indv];
            indv++;
            addition(y, indv, num, total);
        } else {
            System.out.println("The sum of total of the numbers entered is: " + total);

        }
    }

}
