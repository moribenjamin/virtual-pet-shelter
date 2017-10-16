import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	VirtualPet pet1 = new VirtualPet("Spot", " is a little dogged around the ears", 13, 25, 8);
	VirtualPet pet2 = new VirtualPet("Tom", "can be anxious at times", 22, 16, 5);
	VirtualPet pet3 = new VirtualPet("Woody", "has lost a few feathers", 30, 18, 10);
	VirtualPet pet4 = new VirtualPet("Jerry", "looks sort of mousey", 26, 30, 7);
	
	private Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();
	
	
	// the collection focuses on the value section of the map
	public Collection<VirtualPet> allThePets() {
		return shelterPets.values();
	}
	
	public int getSize() {
		return shelterPets.size();
	}

	// accessor method for a particular pet
		public VirtualPet getName(String name) {
			return shelterPets.get(name);
		}

		public VirtualPet getDescription(String description) {
			return shelterPets.get(description);
		}
		
		Set<String> petNames = shelterPets.keySet();
		
			
		
		public void admitPet(VirtualPet pet) {
			shelterPets.put(pet.getName(), pet);
		}
	
		public VirtualPet adoptPet(String name) {
			return shelterPets.remove(name);
			
		}
        	
		
		public void feedAll() {
        	     for (VirtualPet feedAll : shelterPets.values()) {
        	    	 feedAll.feed();
        	     }
        }
		
		public void waterAll() {
				for (VirtualPet waterAll : shelterPets.values()) {
					waterAll.water();
					
				}
		}
		
     
		public void tickAll() {
				for (VirtualPet tickAll : shelterPets.values()) {
					tickAll.tick(0);
					
				}
				
		}
	
}
