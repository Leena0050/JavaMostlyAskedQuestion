package javaprograms;

public class EvenandODDdigitinaNumber {
    public static void main(String[] args) {
        int num = 1234;
        int even_count = 0;
        int odd_count = 0;

        while (num>0) //1234  //123
        {
            int rem = num%10; //4 //3

            if (num%2==0)
            {
                even_count++; //1
            }
            else {
                odd_count++; //1
            }
            num = num/10; //123
        }
        System.out.println("Even"+ even_count);
        System.out.println("odd" + odd_count);

    }
}
