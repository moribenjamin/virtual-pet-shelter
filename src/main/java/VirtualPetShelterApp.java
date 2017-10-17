import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

//mori
public class VirtualPetShelterApp {

	static String selection;
	static String newName;
	static String newDesc;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		VirtualPetShelter shelterPets = new VirtualPetShelter();

		VirtualPet pet1 = new VirtualPet("Spot", " is a little dogged around the ears", 13, 25, 8, 4);
		VirtualPet pet2 = new VirtualPet("Tom", "can be anxious at times", 22, 16, 5, 8);
		VirtualPet pet3 = new VirtualPet("Woody", "has lost a few feathers", 30, 18, 10, 12);
		VirtualPet pet4 = new VirtualPet("Jerry", "looks sort of mousey", 26, 30, 7, 16);
		
		shelterPets.admitPet(pet1);
		shelterPets.admitPet(pet2);
		shelterPets.admitPet(pet3);
		shelterPets.admitPet(pet4);

		System.out.println("Thank you for volunterring at Mori's Virtual Pet Shelter and Hair Salon!\n");

		petStatus(shelterPets);

		listOptions();

		int choice = input.nextInt();

		do {

			if (choice == 1) {
				shelterPets.feedAll();
				System.out.println("Ok, so you want to feed the pets\n");
				System.out.println("Thank you for feeding the pets.");
				petStatus(shelterPets);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 2) {
				shelterPets.waterAll();
				System.out.println("Ok, so you'd like to water the pets.\n");
				System.out.println("Thank you for watering the pets.");
				petStatus(shelterPets);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 3) {
				shelterPets.petThePets();
				System.out.println("Ok, so  you want to pet one of the pets?\t");
				for (VirtualPet current : shelterPets.allThePets()) {
					System.out.println("[" + current.getName() +"]" + "\t" + current.getDescription() + "\t");
				}
				System.out.println("Which one? Enter their name");
				selection = input.next();				
				System.out.println("Ok, go ahead and pet " + selection);
				petStatus(shelterPets);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 4) {
				System.out.println("That's Great!\n");
				for (VirtualPet current : shelterPets.allThePets()) {
					System.out.println("[" + current.getName() +"]" + "\t" + current.getDescription());
				}
				System.out.println("Which one?  Enter their name.");				
				selection = input.next();
				shelterPets.adoptPet(selection);
				System.out.println("I'm sure you will provide a wonderful home for " + selection + ".");				
				petStatus(shelterPets);
				listOptions();
				choice = input.nextInt();

			} else if (choice == 5) {				
				System.out.println("Ok, so tell us a little about him/her.");
				System.out.print("What's their name?");
				newName = input.next();
				System.out.println("What are they like?");
				newDesc = input.nextLine();
				VirtualPet newPet = new VirtualPet(newName, newDesc);
				shelterPets.admitPet(newPet);
				for (VirtualPet current : shelterPets.allThePets()) {
					System.out.println("[" + current.getName() +"]" + "\t" + current.getDescription());
				}
				System.out.println("Thank you. We will try to place him in a good home");
				petStatus(shelterPets);
				listOptions();
				choice = input.nextInt();
			} else if (choice == 6) {
				System.out.println("It's been a pleasure.");
				System.out.println("Thank you for your visit. Please come again soon.");
				break;
			} else {
				System.out.println("OH! COME ON!");
				System.out.println("THis is not a zoo!");
				break;
			}
		} while (choice != 6 );
		}
	

	public static void petStatus(VirtualPetShelter theShelter) {
		System.out.println("\nThis is the status of your pets:\n");
		System.out.println("Name    |Hunger |Thirst |Boredom");
		System.out.println("--------|-------|-------|-------");
		for (VirtualPet current : theShelter.allThePets()) {
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

	}
}
