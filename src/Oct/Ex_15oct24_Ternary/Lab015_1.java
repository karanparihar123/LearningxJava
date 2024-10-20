package Oct.Ex_15oct24_Ternary;

import java.util.Scanner;

public class Lab015_1 {
    public static void main(String[] args) {
         //Syntex for ternary operator
        // Condition ? Statment1 : Statment2

        int number;
        number = Integer.parseInt(args[0 ]);
        System.out.println(number<=18 ? "Small Number" : "Greater Number");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = scanner.nextInt();
        System.out.println(age>18 ? "Allowed to vote" : " Not allowed to vote");

        double num= 21.5d;
        String output = number>18 ? "Small Number" : "Greater Number";
        System.out.println(output);



    }
}
