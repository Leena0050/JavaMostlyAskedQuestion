package javaprograms;

public class countsumofdigit {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num>0){ //1234 //123 //12 //1
            sum = sum+num%10; //0+ 4 = 4 //4+3=7  //7+2=9  //9+1=10
            num = num/10;// 123 //12 //1 //0

        }
        System.out.println("sum" + sum);
    }
}
