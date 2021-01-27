package exam;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int i = 1;
        for (int n = 1; n <= num; n++) {
            for (int p = 0; p < i; p++) {
                System.out.print("*");
            }
            System.out.println();
            if (n - sumI(i) == 0) {
                i++;
            }
        }

    }
    static int sumI (int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
