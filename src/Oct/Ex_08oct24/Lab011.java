package Oct.Ex_08oct24;

import java.util.Scanner;

public class Lab011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Marks");
        double marks = scanner.nextDouble();

        if(marks>=90){
            System.out.println("Pass with 1st with Marks " +  marks);
            
        }
        else if (marks <=89 && marks>=50){
            System.out.println("Pass with second divison with Marks " + marks);

        }
        else{
            System.out.println("Fail Marks " + marks);
        }


    }
}
