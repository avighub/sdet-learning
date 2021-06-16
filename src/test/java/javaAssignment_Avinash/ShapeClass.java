package javaAssignment_Avinash;

import java.util.Scanner;

public class ShapeClass {

	public static void main(String[] args) {
		String shapeInput;
		System.out.print("Please enter shape choice : ");
		Scanner sc = new Scanner(System.in);
		shapeInput = sc.next();
		
		shape(shapeInput);
		sc.close();
	}
	
	
	public static void shape(String s) {
		System.out.println("This is a " +s);
		System.out.println("Playing music specific to " + s + " shape (" + s + ".wmv)");
	}

}
