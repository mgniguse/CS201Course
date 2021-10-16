package Lab12;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String word = input.nextLine();
        reverse(word);
    }
    public static void reverse(String str){
        if (str.length() == 1){
            System.out.print(str);
        }
        else
        { reverse((str.substring(1, str.length())));
            System.out.print(str.substring(0,1));

        }
    }
}
