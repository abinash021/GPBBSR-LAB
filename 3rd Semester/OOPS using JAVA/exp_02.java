//Write a Java program to print the sum of two numbers.

import java.util.Scanner;
 public class exp_02 {
    public static void main(String[] args) {
          int first_num, second_num, sum;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            first_num = input.nextInt();
            System.out.print("Enter second number: ");
            second_num = input.nextInt();
            input.close();
            sum = first_num + second_num;
            System.out.println("Sum of " + first_num + " and " + second_num + " is " + sum);
    }
}
