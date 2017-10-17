import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	private Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	// the collection focuses on the value section of the map
	public Collection<VirtualPet> allThePets() {
		return shelterPets.values();
	}

	public int getSize() {
		return shelterPets.size();
	}


	
	// returns a specific VirtualPet object that matches the key supplied
	public VirtualPet getAPet(String name) {
		return shelterPets.get(name);
	}

	public void admitPet(VirtualPet newPet) {
		shelterPets.put(newPet.getName(), newPet);
	}

	public VirtualPet adoptPet(String name) {
		return shelterPets.remove(name);

	}

	public void feedAll() {
		for (VirtualPet aPet : allThePets()) {
			aPet.feed();
		}
	}

	public void waterAll() {
		for (VirtualPet aPet : allThePets()) {
			aPet.water();

		}
	}

	public void petThePets() {
		for (VirtualPet aPet : allThePets()) {
			aPet.petThePets();
		}
	}

	public void tickAll(int userChoice) {
		for (VirtualPet aPet : allThePets()) {
			aPet.tick(userChoice);

		}

	}

	
	
		
	}


