package youdoit;
import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dozenEggs;
		int looseEggs;
	
		int eggsOrdered;
		double totalPrice;
		double totalSingle;
		double totalDozen;
				
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many eggs would you like? >>>>");
		eggsOrdered = input.nextInt();
		
		dozenEggs = eggsOrdered/12;
		looseEggs = eggsOrdered%12;
		
		totalSingle = .45*looseEggs;
		totalDozen = 3.25*dozenEggs;
		
		totalPrice = totalSingle + totalDozen;
		
		
		
		System.out.println("You ordered" + eggsOrdered + "eggs That's" + dozenEggs + "dozen at 3.25 per dozen and" + 
		looseEggs + "loose eggs at 45 cents each for a total of" + totalPrice + "dollars.");
	}

}
