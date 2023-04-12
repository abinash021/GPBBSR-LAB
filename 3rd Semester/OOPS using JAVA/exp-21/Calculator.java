//Develop a java project for percentage calculator/temperature conversion tool.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double result;
        boolean running = true;
        while (running) {
            System.out.println("Select an option:");
            System.out.println("1. Percentage Calculator");
            System.out.println("2. Temperature Conversion Tool");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the total value:");
                    double totalValue = scanner.nextDouble();
                    System.out.println("Enter the percentage:");
                    double percentage = scanner.nextDouble();
                    result = calculatePercentage(totalValue, percentage);
                    System.out.println("Result: " + result + "%");
                    break;
                case 2:
                    System.out.println("Select an option:");
                    System.out.println("1. Celsius to Fahrenheit");
                    System.out.println("2. Fahrenheit to Celsius");
                    int temperatureChoice = scanner.nextInt();
                    System.out.println("Enter the temperature:");
                    double temperature = scanner.nextDouble();
                    switch (temperatureChoice) {
                        case 1:
                            result = celsiusToFahrenheit(temperature);
                            System.out.println("Result: " + result + "°F");
                            break;
                        case 2:
                            result = fahrenheitToCelsius(temperature);
                            System.out.println("Result: " + result + "°C");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    public static double calculatePercentage(double totalValue, double percentage) {
        return (percentage / 100) * totalValue;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}