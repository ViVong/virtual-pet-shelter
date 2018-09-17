package virtualpetshelter;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	HashMap<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();
	public void allPets() {
		
	}
	public VirtualPet onePet(String name) {
		return shelter.get(name);
	}
	public void feedPets() {
		
	}
	public void waterPets() {
		
	}
	public void playWith(String name) {
		shelter.get(name).playWith();
	}
	public void adopt(String name) {
		shelter.remove(name);
	}
	public void admit(String name, String description) {
		VirtualPet newPet = new VirtualPet(name, description);
		shelter.put(newPet.name, newPet);
	}
	public void admit(String name, String description, int food, int water, int mood) {
		VirtualPet newPet = new VirtualPet(name, description, food, water, mood);
		shelter.put(newPet.name, newPet);
	}
	public void tick() {
		
	}
}
