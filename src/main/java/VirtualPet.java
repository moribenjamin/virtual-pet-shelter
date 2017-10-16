
public class VirtualPet {

	// Instance Variables
	private String name;
	private String description;
	private int hunger;
	private int thirst;
	private int boredom;
	private int needsPetting;

	// Constructor
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.needsPetting = 25;
		
	}

	// Constructor
	public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.needsPetting = 25;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}
		
	public int getNeedsPetting () {
		return needsPetting;
	}
		
	public void feed() {
		hunger -= 2;
		thirst += 3;
		boredom +=3;
			
	}
	
	public void water() {
		hunger += 1;
		thirst -= 3;
		boredom +=2;
					
	}
	
	public void petPet(String name, String description) {
		needsPetting -=5;
	}
	
	public void tick(int choice) {
		hunger += choice;
		thirst -= choice;
		boredom *= choice;
		
	}
	
	}
	

