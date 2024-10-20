package Oct.Ex_15oct24_Ternary;

public class LAb015_2 {
    public static void main(String[] args) {
        //find greater between 2 numbers
        int x=10;
        int y= 50;
        int z= 7;

        //int a = x>y ? x : y ;
        //System.out.println(a);

        System.out.println((x >= y && x >= z) ? x : (z >= y ? z : y));
        System.out.println(++x + x++ + x++);
    }
}
