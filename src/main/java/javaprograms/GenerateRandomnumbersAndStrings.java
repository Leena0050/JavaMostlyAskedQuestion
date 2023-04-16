package javaprograms;

import java.util.Random;

public class GenerateRandomnumbersAndStrings {
    public static void main(String[] args) {
        //Apprach 1 - Random number
        Random rand = new Random();
        int Rand_number = rand.nextInt(1000);//it will generate between 0 to 9
        System.out.println(Rand_number);

        double rand_double = rand.nextDouble(1000);
        System.out.println(rand_double);
        // Approach 2 - MATH
        System.out.println(Math.random());
    }
}
