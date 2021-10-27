package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("Enter number: ");
       int number = input.nextInt();
       int devider = 2;
       boolean prime = true;


       while (devider < number) {
         if (number % devider == 0) {
           prime = false;

         }


         devider++;
       }
       System.out.println("Prime number: " + prime);
    }

}