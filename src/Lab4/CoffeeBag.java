package Lab4;

import java.util.Scanner;

public class CoffeeBag {

        public static void main(String []args){

            double totalPrice = 0;
            double bagWeight=0;
            double numberOfBags =0;
            double pricePerLb=5.99;
            double totalPriceWithTax=0;
            double taxrate=7.25;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of bags sold: ");
            numberOfBags=in.nextDouble();
            System.out.print("Enter weight per a bag: ");
            bagWeight=in.nextDouble();

            System.out.println("Price per a pound: $5.99");
            System.out.println("Sales tax: 7.25%");

            totalPrice = bagWeight * numberOfBags * pricePerLb;

            totalPriceWithTax = totalPrice + totalPrice * taxrate/100;

            totalPriceWithTax= Math.round(totalPriceWithTax * 100.0) / 100.0;

            System.out.println("Total Price: "+ totalPriceWithTax);


        }
    }


