package exam;

import java.util.Scanner;

public class ReversedBinary {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("输入一bai个十进制数");
        number = in.nextInt();
        if (number < 0) {
            System.out.println("Error: Not a positive integer");
        } else {
            System.out.print("Convert to binary is:");
            printBinaryform(number);
        }
    }

    private static void printBinaryform(int number) {
        int remainder;
        if (number <= 1) {
            System.out.print(number);
            return;
        }
        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}