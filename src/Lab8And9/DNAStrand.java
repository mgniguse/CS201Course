package Lab8And9;

import java.util.Scanner;

public class DNAStrand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a DNA strand letters");
        String strand1 = input.nextLine().toUpperCase();
        while(strand1 !=""){
            for (int i = 0; i < strand1.length(); i++) {
                char strands = strand1.charAt(i)=='A'? 'T':strand1.charAt(i)=='T'?'A':strand1.charAt(i)=='G'?'C':'G';
                System.out.print(strands);
            }
            System.out.println();
            System.out.println("Enter a DNA strand letters");
            strand1 = input.nextLine().toUpperCase();
        }
    }
}
