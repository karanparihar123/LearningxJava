package Oct.Ex_04oct24;


import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
//reading a number whose table is to be print
        int num=sc.nextInt();*/
        int i=10;
//loop start execution form and execute until the condition i<=10 becomes false
        for(int a=1; a <= 10; a++)
        {
//prints table of the entered number
            System.out.println(i*a);
        }
        /*int i=10;
        for(a=1; a++; a<=10){
            int a=0;
            System.out.println(i*a);
        }*/
    }
}
