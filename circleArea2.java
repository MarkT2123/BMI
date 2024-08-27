import java.util.Scanner;

public class circleArea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base the length of the triangle : ");
        float base= scanner.nextFloat();
        System.out.print("Enter the height the length of the triangle : ");
        float height = scanner.nextFloat();
        float triangle = (1/2f) * base * height;
        System.out.println("Area is equr to" + triangle + "circleArea2");
        System.out.println("-----------------------------------");
        System.out.print("Enter the length of the square : ");
        float length= scanner.nextFloat();
        float square =length * length ;
        System.out.println("Area of the square" + square + "square util");
        

}
}