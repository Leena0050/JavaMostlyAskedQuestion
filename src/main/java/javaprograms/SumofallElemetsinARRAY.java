package javaprograms;

public class SumofallElemetsinARRAY { // n-5  n-1=4
    public static void main(String[] args) {


        int a[] = {5, 2, 7, 9, 6};
        int sum = 0;

//        int len = a.length; // 5
//        for (int i = 0; i <= len - 1; i++) {
//            sum = sum + a[i];
//        }
//        System.out.println(sum);

        //for each loop
        for(int value : a)   // 5  // 2
        {
            sum = sum +value; // 0+5=5  // 5+2 = 7
        }
        System.out.println(sum);
    }

}
