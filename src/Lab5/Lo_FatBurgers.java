package Lab5;

import java.util.Scanner;

public class Lo_FatBurgers {
    public static void main(String[] args) {
        final int WEEKLY_HOURS =40;
        final double WEEKLY_WAGE =7.25;
        final double OVERTIME_HOUR = 10.875;
        Scanner msgie = new Scanner(System.in);
        System.out.println("Enter the number of hours worked");
        int hours = msgie.nextInt();
        if(hours <= 40){
            System.out.println("Total wage is: "+ WEEKLY_WAGE * hours);
        }else{
            System.out.println("Total wage is: "+ (OVERTIME_HOUR * (hours-40)+(WEEKLY_WAGE * WEEKLY_HOURS)));
        }
        System.out.println("Enter total sales");
        double sales = msgie.nextDouble();
        if(sales >= 1 && sales < 99.99) {
            double commission0 = (5 / 100 * sales);
            System.out.println("Total sale is: " + commission0 * sales);
        }else if (sales >100.00 && sales < 299.99){
            double commission1 = (10/100 *sales);
            System.out.println("The total sale is: " + commission1  * sales);
        } else {
            double commission2 = (15 / 100 * sales);
            System.out.println("The total sale is: " + (commission2 * sales));
        }

    }

}
