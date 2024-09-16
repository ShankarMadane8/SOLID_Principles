package ocp;

public class OpenClosedPrinciple {
	
	 public static void main(String[] args) {
	        // Create instances of shapes
	        Shape rectangle = new Rectangle(5.0, 10.0);
	        Shape circle = new Circle(7.0);

	        // Create ShapeAreaCalculator
	        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

	        // Calculate and print the area of the shapes
	        System.out.println("Area of the rectangle: " + calculator.calculateArea(rectangle));
	        System.out.println("Area of the circle: " + calculator.calculateArea(circle));
	    }

}
