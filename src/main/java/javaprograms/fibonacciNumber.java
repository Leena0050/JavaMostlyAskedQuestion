package javaprograms;
// 0 1   1 2 3 5 8 13 21
public class fibonacciNumber {
    public static void main(String[] args) {
        int n1=0, n2=1, sum=0;

        System.out.println(n1 + " " + n2);

        for (int i=2 ; i<10 ; i++)
        {
            sum = n1 + n2;// 0+1=1 //1+1=2 // 1+2
            System.out.println(" " + sum);//1 // 2 //3
            n1 = n2; //1 // 1 //2
            n2 =sum; //1 //2 //3

        }

    }
}
