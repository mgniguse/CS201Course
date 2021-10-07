package Lab7;

public class Ques3 {
    public static void main(String[] args) {
        int output = 10;
        for(int r = 0; r < 4; r++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(output + " ");
                output++;
            }
            System.out.println();
        }
    }
}
