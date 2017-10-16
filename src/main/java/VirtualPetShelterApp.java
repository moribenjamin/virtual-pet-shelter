import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;
//mori
public class VirtualPetShelterApp {

	static String selection;

	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
	
		
		System.out.println("Thank you for volunterring at Mori's Virtual Pet Shelter and Hair Salon!\n");
	
		
		petStatus();
		
		
		
		listOptions();
		
		int choice = 0;

		do {
			{
			if (choice == 1) {
				shelterPets.feedAll(choice));
				System.out.println("Ok, so you want to feed the pets");
				System.out.println("Thank you for feeding the pets.");
				
				petStatus();
				
				}
				
				input.nextLine();
				listOptions();
				
			} else if (choice == 2) {
				System.out.println("Ok, so you'd like to water the pets.");
				shelterPets.waterAll(choice);
				System.out.println("Thank you for watering the pets.");
						
				petStatus();
				
				
				
				input.nextLine();
				listOptions();
				
			} else if (choice == 3) {
				System.out.println("Ok, so you want to pet one of the pets?");
				
				System.out.println("Which one?");
				selection = input.nextLine();
			
				System.out.println(selection);
				System.out.println("Ok, go ahead and pet " + selection);
				
			
			} else if (choice == 4) {
				System.out.println("That's Great!\n");
						
				System.out.println("Which one?  Choose one.");
				selection = input.nextLine();
						
				
				System.out.println("I'm sure you will provide a wonderful home for " + selection);
				
				input.nextLine();
				listOptions();
			} else if (choice == 5) {
				System.out.println("Thank you. We will try to place him in a good home");
			}
				
			
			
			} else if (choice == 6) {	
				System.out.println("Thank you for your visit. Please come again soon.");
				break;	
				
			} else {
				System.out.println("COME ON!");
				System.out.println("THis is not a zoo!");
				break;
			} while (choice != 6); {
				

		}
		
			
	public static void petStatus() {
		System.out.println("\nThis is the status of your pets:\n");
		System.out.println("Name    |Hunger |Thirst |Boredom");
		System.out.println("--------|-------|-------|-------");
		for (VirtualPet current : shelterPets.allThePets()) {
			System.out.println(current.getName() + "\t|" + current.getHunger() + "\t|" + current.getThirst() + "\t|"
					+ current.getBoredom());
		}
		
	}

	public static void listOptions() {
		System.out.println("\n1. Feed the pets");
		System.out.println("2. Water the pets");
		System.out.println("3. Pet a pet");
		System.out.println("4. Adopt a pet");
		System.out.println("5. Admit a pet");
		System.out.println("6. Quit");

		input.close();
	}
}
	
			