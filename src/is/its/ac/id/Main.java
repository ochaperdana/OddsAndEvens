package is.its.ac.id;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        String name, choice;
        String letter = "";
        String result = "";
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name?");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.print("Hi " + name + ", Which one do you choose? (O)dds or (E)evens?");
        Scanner input2 = new Scanner(System.in);
        choice = input2.next();
        if (choice.equals("o")) {
            letter = "Evens";
            choice = "Odds";
        } else if (choice.equalsIgnoreCase("e")) {
            letter = "Odds";
            choice = "Evens";
        } else {
            System.out.println("Undefined");
        }
        System.out.println(name + " has picked " + choice + "! The computer will be " + letter + ".");
        System.out.println("---------------------------------");


        System.out.print("How many \"fingers\" do you put out?");
        Scanner input3 = new Scanner(System.in);
        int userNumber = input3.nextInt();
        Random random = new Random();
        int computerNumber = random.nextInt(6);
        System.out.println("The computer plays " + computerNumber + " fingers");
        System.out.println("---------------------------------");

        int sum = userNumber + computerNumber;
        System.out.println("" + userNumber + " + " + computerNumber + " = " + sum);
        if (sum % 2 == 0) {
            letter = "Even";
        } else {
            letter = "Odd";
        }
        System.out.println("" + sum + " is ... " + letter);

        if (letter.equalsIgnoreCase("Even")) {
            if (choice.startsWith(letter)) {
                result = "wins";
            } else {
                result = "loses";
            }
        } else {
            if (choice.equalsIgnoreCase(letter)) {
                result = "wins";
            } else {
                result = "loses";
            }
        }
        System.out.println("It means that " + name + " " + result + "! :)");
        System.out.println("---------------------------------");
    }
}
