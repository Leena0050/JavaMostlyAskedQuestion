package javaprograms;

public class ExtractEvenODD {
    public static void main(String[] args) {
        int a[] = {5, 2, 7, 9, 6};


        ///Extracting Even numbers
        System.out.println("Even numbers in array");
//        for (int i = 0; i <= a.length; i++) //5
//        {
//            if (a[i] % 2 == 0)
//                System.out.println(a[i]);
//
//        }
        for (int value :a){
            if(value%2==0)
                System.out.println(value);
        }

        System.out.println("Odd numbers in array");
        for (int i = 0; i <= a.length; i++) //5
        {
            if (a[i]%2!=0)
                System.out.println(a[i]);

        }
    }
}
