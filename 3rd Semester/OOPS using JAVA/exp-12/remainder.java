//Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.

import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        int num1, num2, max, min;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        input.close();
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        if (max % 6 == min % 6) {
            System.out.println(min);
        } else {
            System.out.println(max);
        }
    }
}
