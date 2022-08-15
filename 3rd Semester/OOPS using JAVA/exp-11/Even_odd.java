//Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        // if num is even print 1 else print 0
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();
        if (num % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
