package Lab11;

import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int N = input.nextInt();
        double[]arr = new double [N];
        double sum = 0;
        double mean = 0;
        double deviation = 0;
        for (int i = 0; i < N; i ++){
            System.out.println("Enter your index ");
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        mean = sum /N;
        for ( int i = 0; i < N; i++){
            deviation += Math.pow((arr[i]-mean),2);
        }
        double stantardDev = Math.sqrt(deviation/N);
        System.out.println("Sum= "+ sum);
        System.out.println("Mean = "+ mean);
        System.out.println(" your Standard deviation is: " +stantardDev);

    }
}
