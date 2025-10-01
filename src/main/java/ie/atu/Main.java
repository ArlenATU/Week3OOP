package ie.atu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Create an instance of Calculator
        Calculator calc = new Calculator();

        Scanner scan1 = new Scanner(System.in);     //an object of scanner

        System.out.print("Choose an operation (add, subtract, multiply, divide): ");
        String operation = scan1.next();    //this variable saves user's input for type of calculation

        System.out.println("Please enter a number: ");
        int firstNum = scan1.nextInt();       //fist number variable
        System.out.println("you entered " + firstNum);


        System.out.println("Please enter a second number:" );
        int secondNum = scan1.nextInt();  //second number variable
        System.out.println("You entered " + secondNum);

        boolean validOperation = true;
        int result = switch (operation) {
            case "add" -> {     //this code is for adding
                yield calc.add(firstNum, secondNum);
            }
            case "subtract" -> {        //this one is for subtraction
                yield calc.subtract(firstNum, secondNum);
            }
            case "multiply" -> {        //this one is for multiplying
                yield calc.multiply(firstNum, secondNum);
            }
            case "divide" -> {          //this one is for dividing
                yield firstNum / secondNum;
            }
            default -> {
                System.out.println("Invalid operation '" + operation +"'"); //default code in case of incorrect input
                validOperation = false;
                yield 0;
            }
        };
        if(validOperation){         //if operation is not valid this code will not run
            System.out.println("The result is: " + result);
        }
    }
}