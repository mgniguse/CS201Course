package Lab11;

import java.util.Scanner;

public class HotAndCold365 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double[][] temp = new double[12][31];
            double maxTemp = 0.0;
            double minTemp = 0.0;
            double Aver = 0.0;
            double sum = 0.0;
            for (int i = 0; i < temp.length; i++) {
                for (int j = 1; j < temp[i].length; j++) {
                    if (temp[i][j] > maxTemp)
                        maxTemp = temp[i][j];
                    if (temp[i][j] < minTemp)
                        minTemp = temp[i][j];
                    sum += temp[i][j];
                }
                double daytemp = maxTemp - minTemp;
                System.out.println("The month temp range is " + daytemp);
                Aver = (sum / temp[i].length);
                System.out.println("The month average temp is for " + i + " is " + Aver);
            }
            System.out.println("Temperature of a day ");
            System.out.println("Enter the month number ");
            int x = input.nextInt();
            if (x < 0 || x > 12) {
                System.out.println("Enter the month number");
                x = input.nextInt();
            }
            System.out.println("Enter the number of day ");
            int y = input.nextInt();
            if (y < 0 || y > 31) {
                System.out.println("Enter the month number ");
                x = input.nextInt();
            }
            System.out.println("The temperature is " + temp[x][y]);
        }
    }



