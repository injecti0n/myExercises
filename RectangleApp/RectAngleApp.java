package new_ex;

import java.util.Scanner;

/*
# inject0r
# RectAngleApp | console version
# Exercises for beginners
*/

public class RectAngleApp {

	public static void main(String[] args) {
		boolean check = false;
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		
		do {
			System.out.println("Enter width: ");
			int width = input.nextInt();
			System.out.println("Enter height: ");
			int height = input.nextInt();
			
			RectAngleUtils r1 = new RectAngleUtils();
			System.out.println("Rectangle1 Area :" + r1.getArea(width, height));
			}while(!check);
			
			

	}

}
