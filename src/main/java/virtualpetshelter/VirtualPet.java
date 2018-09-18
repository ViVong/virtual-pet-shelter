package virtualpetshelter;

public class VirtualPet {

//Name, Type of Animal, Hunger, Thirst, Disposition, Energy

	//Initializing Public & Private Variables
	public String name = "<Default>";
	public String descrip = "<Description>";
	private int hunger = 30;
	private int thirst = 30;
	private int dispo = 20;
	private int clean = 50;
	
	//Constructors
	public VirtualPet(String Name, String Pet) {
		name = Name;
		descrip = Pet;
	}
	public VirtualPet(String Name, String Pet, int food, int water, int mood) {
		name = Name;
		descrip = Pet;
		hunger = food;
		thirst = water;
		dispo = mood;
	}
	
	//Methods affecting hunger
	public void feedPet() {
		hunger -= 5;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	//Methods affecting thirst
	public void giveWater() {
		thirst -= 5;
	}
	
	public int getThirst() {
		return thirst;
	}
	
	//Methods affecting disposition
	public void playWith() {
	 dispo += 10;
	}
	
	public int getDispo() {
		return dispo;
	}
	
	//Increases energy & returns energy value
	public void cleanCage() {
		clean += 5;
	}
	public int getClean() {
		return clean;
	}
	
	//tick method
	public void tick() {
		if (hunger > 0) {
			hunger += 2;
		}
		else {
			hunger = 0;
		}
		if (thirst > 0) {
			thirst += 3;
		}
		else {
			thirst = 0;
		}
		if (dispo > 0) {
			dispo --;
		}
		else {
			dispo = 0;
		}
	}
}

