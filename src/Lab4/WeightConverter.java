package Lab4;

import java.util.Scanner;

    public class WeightConverter {
        private double moonWeight;

        public WeightConverter(double moonWeight) {
            this.moonWeight = moonWeight;
        }

        public double convert(double earthWeight) {
            double weight = earthWeight * 0.167;
            return weight;

        }

        public static void main(String[] args) {
            WeightConverter moonWeight = new WeightConverter(0.167);

            Scanner msgie = new Scanner(System.in);
            System.out.println("Enter your weight");
            double earthweight;
            System.out.println("Your moon weight is: " +moonWeight.convert(earthweight=msgie.nextDouble()));
            msgie.close();

        }
    }


