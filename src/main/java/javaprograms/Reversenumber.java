package javaprograms;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        //Using algorithm

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt(); //1234

//        int rev = 0;
//        while (num!=0)
//        {
//            rev = rev*10 + num%10;
//            num = num/10;
//
//        }
//        System.out.println("Reverse no:" + rev);

        //USing Stringbuffer
//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();
//        System.out.println("Reverse number" + rev);

        // Using string builder

        StringBuilder sbl = new StringBuilder(String.valueOf(num));
        StringBuilder rev = sbl.reverse();
        System.out.println("reverse number: " + rev);





    }
}
