// BMI Calculator

import java.util.Scanner;
import java.util.Locale;


public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        // Variables
        double weight;
        double height;
        double resultOp;
        
        System.out.println("*********************");

        System.out.print("Enter Your Weight:");
        weight = scanner.nextDouble();

        System.out.print("Enter Your Height:");
        height = scanner.nextDouble();

        resultOp = weight / (height * height);





        scanner.close();

    }
}
