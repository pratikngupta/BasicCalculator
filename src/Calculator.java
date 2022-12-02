/*************************************************************************************************
 * Date: 2022/10/1
 * Description: This program is a simple calculator that can perform addition, subtraction, multiplication, and division.
 * What will it do?
    * 1. It will ask the user to enter two numbers.
    * 2. It will ask the user to enter an operator.
    * 3. It will perform the operation on the two numbers.
    * 4. It will display the result.
    * 5. It will ask the user if they want to perform another operation.
 *************************************************************************************************/


import java.util.*; //import scanner class

public class Calculator {
    public static void main(String[] args) {
        double x; //first number
        double y; //Second number
        int choice; //choice of operation

        //get input from user
        Scanner input = new Scanner(System.in);
        do {
            //get input from user
            System.out.print("Enter the first number: ");
            x = input.nextDouble(); //get first number
            System.out.print("Enter the second number: ");
            y = input.nextDouble(); //get second number

            //asking user for choice
            System.out.println("""
                    Enter the operation you want to perform:
                    1. Addition
                    2. Subtraction
                    3. Multiplication
                    4. Division
                    """);

            //starting do while loop
            do {
                System.out.print("Enter your choice: ");
                choice = input.nextInt(); //get choice

                //switch statement with 4 cases and default
                switch (choice) {
                    //case 1: addition
                    case 1:
                        System.out.println("The sum of the two numbers is: " + (x + y));
                        break;

                    //case 2: subtraction
                    case 2:
                        System.out.println("The difference of the two numbers is: " + (x - y));
                        break;

                    //case 3: multiplication
                    case 3:
                        System.out.println("The product of the two numbers is: " + (x * y));
                        break;

                    //case 4: division
                    case 4:
                        //check if y is 0
                        if (y == 0) {
                            //if y is 0, print error message
                            System.out.println("Division by zero is not possible");
                        } else {
                            //if y is not 0, print result
                            System.out.println("The quotient of the two numbers is: " + (x / y));
                        }
                        break;

                    //default: invalid choice
                    default:
                        //print error message if choice is invalid
                        System.out.println("Invalid choice!");
                        break;
                }
            } while (choice < 0 && choice > 5); //end do while loop for choice: this will run until user enters a valid choice

            //ask user if they want to continue
                System.out.print("Do you want to perform another operation? (1 for yes, 0 for no): ");
                choice = input.nextInt();

            } while (choice == 1); //end do while loop for choice: this will run until user enters 0
    }
}
