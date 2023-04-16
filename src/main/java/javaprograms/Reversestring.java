package javaprograms;

public class Reversestring {
    public static void main(String[] args) {
        String str = "ABCD";
        String rev =" ";

        int len = str.length(); //4
        for(int i = len - 1; i>=0 ; i--) // 3 2 1 0
        {
            rev = rev + str.charAt(i); //null +index of 3 =3 DCBA
        }
        System.out.println("reverse string:" + rev);
    }
}
