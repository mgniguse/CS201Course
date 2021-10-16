package Lab12;

import java.util.Scanner;

public class CountNumberOfChars {
    public static class StrChars {
        public String word;

        public static void main(String[] args) {
            StrChars msgie = new StrChars();
            int length;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a String");
            msgie.word = input.nextLine();
            length = msgie.recursion(msgie.word, 0);
            System.out.println("Number of characters are: " + length++);
        }

        private int recursion(String str, int count) {
            while (!str.substring(count).isEmpty()) {
                count++;
                recursion(str.substring(0), count);
            }
            return count;

        }
    }
}
