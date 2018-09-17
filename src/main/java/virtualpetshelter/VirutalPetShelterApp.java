package virtualpetshelter;

public class VirutalPetShelterApp {
	
	public static void main(String[] args) {
		VirtualPetShelter cleve = new VirtualPetShelter();
		cleve.admit("Fido", "a fine pupper.");
		cleve.admit("Diaper", "a stinky doggo.", 500, 200, 0);
		cleve.admit("Lionel", "too rich to be here", 5, 8, 920);
		cleve.allPets();
		cleve.onePet("Diaper");
	}
}
