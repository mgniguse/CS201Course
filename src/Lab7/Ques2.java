package Lab7;

public class Ques2 {
    public static void main(String[] args) {
        // Question number 1.a.
        // for loop
        int n = 0;
        for (int i = 1; i <= 100; i++) {

            n = n + i;
        }
        System.out.println(n);
        // while loop
        int n1 = 0;
        int x = 1;
        while (x <= 100) {
            n1 = n1 + x;
            x++;
        }
        System.out.println(n1);
        //do while loop
        int n2 = 0;
        int y = 1;
        do {
            n2 = n2 + y;
            y++;
        } while (y <= 100);
        System.out.println(n2);
        // Question number 1.b.
        //For loop
        int sum = 0;
        for (int m = 5; m <= 50; m += 5) {
            sum = sum + m;
        }
        System.out.println(sum);
        // while loop
        int sum1 = 0;
        int l = 5;
        while (l <= 50) {
            sum1 = sum1 + l;
            l+=5;
        }
        System.out.println(sum1);
        // do while loop
        int sum3 = 0;
        int t = 5;
        do {
            sum3 = sum3 + t;
            t+=5;
        }while (t <= 50);
        System.out.println(sum3);

    }
}

