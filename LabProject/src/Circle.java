//**********************************************************
// Circle.java
//
// Print the area of a circle with two different radii
//**********************************************************
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object

        // Declare a PI constant and initialize it with Math.PI
        final double PI = Math.PI; //3.141592653589793

        // Declare radius and assign a value
        double radius;
        System.out.print("Please enter a value for the radius: ");
        radius = scan.nextDouble();

        // Compute area and circumference
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        // Print results
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);

        // Assign a new value to radius and print the results again
        System.out.print("Please enter a value for the radius: ");
        radius = scan.nextDouble();
        area = PI * radius * radius;
        circumference = 2 * PI * radius;

        System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);

        scan.close(); // Close the Scanner object
    }
}
