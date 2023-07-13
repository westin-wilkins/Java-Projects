import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("List of operations: add subtract multiply divide alphabetize");
        System.out.print("\nEnter an operation:\n");
        String operation = scan.nextLine().toLowerCase();

        switch (operation) {
            case "add": {
                System.out.print("Enter two integers:\n");
                int num1, num2;
                if (scan.hasNextInt()) {
                    num1 = scan.nextInt();
                    if (scan.hasNextInt()) {
                        num2 = scan.nextInt();
                        int result = num1 + num2;
                        System.out.println("Answer: " + result);
                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;
            }
            case "subtract": {
                System.out.print("Enter two integers:\n");
                int num1, num2;
                if (scan.hasNextInt()) {
                    num1 = scan.nextInt();
                    if (scan.hasNext()) {
                        num2 = scan.nextInt();
                        int result = num1 - num2;
                        System.out.println("Answer: " + result);
                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;
            }
            case "multiply": {
                System.out.print("Enter two doubles:\n");
                double num1, num2;
                if (scan.hasNextDouble()) {
                    num1 = scan.nextDouble();
                    if (scan.hasNextDouble()) {
                        num2 = scan.nextDouble();
                        double result = num1 * num2;
                        System.out.printf("Answer: %.2f", result);
                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;
            }
            case "divide": {
                System.out.print("Enter two doubles:\n");
                double num1, num2;
                if (scan.hasNextDouble()) {
                    num1 = scan.nextDouble();
                    if (scan.hasNextDouble()) {
                        num2 = scan.nextDouble();
                        if (num2 == 0) {
                            System.out.println("Invalid input entered. Terminating...");
                        } else {
                            double result = num1 / num2;
                            System.out.printf("Answer: %.2f", result);
                        }
                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                } else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;
            }
            default: {
                System.out.println("Invalid input entered. Terminating...");
                break;
            }
        }

    }
}
