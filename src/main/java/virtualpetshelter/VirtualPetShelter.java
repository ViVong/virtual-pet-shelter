package virtualpetshelter;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	HashMap<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();
	
	public void allPets() {
		System.out.println("\nName\t| Hunger | Thirst | Mood |");
		System.out.println("--------|--------|--------|------|");
		for (Map.Entry<String, VirtualPet> entry: shelter.entrySet()) {
			System.out.println(entry.getValue().name + "\t| " + entry.getValue().getHunger() + "\t | " + entry.getValue().getThirst() + "\t  | " + entry.getValue().getDispo() + "\t |");
		}
	}
	public void onePet(String name) {
		System.out.println("\nName\t| Hunger | Thirst | Mood |");
		System.out.println("--------|--------|--------|------|");
		System.out.println(shelter.get(name).name + "\t| " + shelter.get(name).getHunger() + "\t | " + shelter.get(name).getThirst() + "\t  | " + shelter.get(name).getDispo() + "\t |");
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
		for (Map.Entry<String, VirtualPet> entry: shelter.entrySet()) {
			entry.getValue().tick();
		}
	}
}
