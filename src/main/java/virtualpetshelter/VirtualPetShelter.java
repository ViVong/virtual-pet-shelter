package virtualpetshelter;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	HashMap<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();
	
	public void allPets() {
		System.out.println("\nName\t| Hunger | Thirst | Mood | Cleaniness |");
		System.out.println("--------|--------|--------|------|------------|");
		for (Map.Entry<String, VirtualPet> entry: shelter.entrySet()) {
			System.out.println(entry.getValue().name + "\t| " + entry.getValue().getHunger() + "\t | " + entry.getValue().getThirst() + "\t  | " + entry.getValue().getDispo() + "\t | " + entry.getValue().getClean() + "\t      |");
		}
	}
	public HashMap<String, VirtualPet> shelter(){
		return shelter;
	}
	public VirtualPet onePet(String name) {
		return shelter.get(name);
	}
	public void feedPets() {
		for (Map.Entry<String, VirtualPet> entry: shelter.entrySet()) {
			entry.getValue().feedPet();
		}
	}
	public void waterPets() {
		for (Map.Entry<String, VirtualPet> entry: shelter.entrySet()) {
			entry.getValue().giveWater();
		}
	}
	public void playWith(String name) {
		shelter.get(name).playWith();
	}
	public void cleanCage(String name) {
		shelter.get(name).cleanCage();
	}
	public void adopt(String name) {
		shelter.remove(name);
	}
	public void admit(String name, String description) {
		VirtualPet newPet = new VirtualPet(name, description);
		shelter.put(newPet.name.toLowerCase(), newPet);
	}
	public void admit(String name, String description, int food, int water, int mood) {
		VirtualPet newPet = new VirtualPet(name, description, food, water, mood);
		shelter.put(newPet.name.toLowerCase(), newPet);
	}
	public void tick() {
		for (Map.Entry<String, VirtualPet> entry: shelter.entrySet()) {
			entry.getValue().tick();
		}
	}
}
