// BMI Calculator

import java.util.Scanner;
import java.util.Locale;


public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // Variables
        double weight;
        double height;
        double resultOp;
        
        System.out.println("***********************");

        // Labels for get data from user
        System.out.print("Enter Your Weight:");
        weight = scanner.nextDouble();

        System.out.print("Enter Your Height:");
        height = scanner.nextDouble();

        resultOp = weight / (height * height);

        System.out.printf("Your BMI is: %.2f\n", resultOp);

        // IF-ELSE Statesments
        if(resultOp < 18.5 ){
          System.out.println("You are UnderWeight");
        }else if(resultOp > 18.5 || resultOp < 24.9){
          System.out.println("You are Normal Weight");
        }else if(resultOp > 25.0 || resultOp < 29.9){
          System.out.println("You are Overweight");
        }else if(resultOp > 30.0 || resultOp < 34.9){
            System.out.println("You are Obesit Class I");
        }else if(resultOp > 35.0 || resultOp < 39.9){
            System.out.println("You are Obesit Class II");
        }else{
            System.out.println("You are Obesity Class III");
        }




        scanner.close();

    }
}
