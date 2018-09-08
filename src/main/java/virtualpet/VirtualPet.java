package virtualpet;

public class VirtualPet {

//Name, Type of Animal, Hunger, Thirst, Disposition, Energy
//Let (Name) Decide, Energy Determines Rebellion, Abandon Pet.

	public String name = "<Default>";
	public String animal = "<Animal>";
	private int hunger = 50;
	private int thirst = 50;
	private int dispo = 25;
	private int energy = 50;
	
	public VirtualPet() {
	}
	
	public VirtualPet(String Name, String Pet) {
		name = Name;
		animal = Pet;
	}
	
	public void setHunger(int i) {
		hunger = i;
	}
	
	public int getHunger() {
		return hunger;
	}

}

