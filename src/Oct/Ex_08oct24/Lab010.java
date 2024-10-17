package Oct.Ex_08oct24;

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter you age");
        int age = scanner.nextInt();

        Scanner scanner1= new Scanner(System.in);
        System.out.println("Enter you Gender");

        String Gender = scanner1.nextLine();

        if (age >=20){
            System.out.println(age);
            System.out.println(Gender);
        }
        else {
            System.out.println("Your age is less the required age");
            System.out.println("Age is mandatory");
        }
    }
}
