package virtualpetshelter;

public class VirutalPetShelterApp {
	
	public static void main(String[] args) {
		VirtualPetShelter cleve = new VirtualPetShelter();
		cleve.admit("Fido", "a fine pupper.");
		cleve.admit("Diaper", "a stinky doggo.", 25, 30, 25);
		cleve.admit("Lionel", "too rich to be here", 40, 40, 10);
		cleve.allPets();
	}
}
