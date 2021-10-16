package Lab12;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        int intgr[] = new int[n];
        System.out.println("Enter "+ n +" " +"numbers");
        for( int i = 0; i < n; i++){
            intgr[i] = input.nextInt();
        }
        small (intgr, n, 0, intgr[0]);
    }
    public static void small(int y[], int num, int indx, int least){
        if (indx < num){
            if ( least <= y[indx]){
                indx++;
                small(y, num, indx,least);
            } else{
                least =y[indx];
                indx++;
                small(y, num, indx,least);
            }
        }
        else {
            System.out.println("The smallest Number Entered is: " + least);
        }
    }
}
