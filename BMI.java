import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your weight in kilograms : ");
        float weight= scanner.nextFloat();
        System.out.print("Enter your height in meters :");
        float height = scanner.nextFloat();
        double BMI = weight /( height * height);
        System.out.println("Your MBI for weight = " + weight + "kg"+"and height = "+height 
        +"meters is :" + BMI + "bmi.");
    } 
}