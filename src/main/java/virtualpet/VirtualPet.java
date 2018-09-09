package virtualpet;

public class VirtualPet {

//Name, Type of Animal, Hunger, Thirst, Disposition, Energy
//Let (Name) Decide, Energy Determines Rebellion, Abandon Pet.

	//Initializing Public & Private Variables
	public String name = "<Default>";
	public String animal = "<Animal>";
	private int hunger = 20;
	private int thirst = 20;
	private int dispo = 25;
	private int energy = 50;
	
	//Constructor with & without input
	public VirtualPet() {
	}
	
	public VirtualPet(String Name, String Pet) {
		name = Name;
		animal = Pet;
	}
	
	//Decreases hunger & Outputs verbally hunger
	public void feedPet(int i) {
		hunger -= i;
		dispo += (i/2);
		energy += 10;
	}
	
	public String getHunger() {
		if (hunger > 39 && hunger < 50) { // 40 to 49
			return "Starving";
		}
		else if (hunger > 10 && hunger < 40) { // 11 to 39
			return "Hungry";
		}
		else if (hunger > 49) { // 50+
			return "Dead";
		}
		else { // 0 to 10
			return "Full";
		}
	}

	//Decreases thirst by 5 & Verbally outputs thirst
	public void giveWater() {
		thirst -= 10;
		energy += 5;
	}
	
	public String getThirst() {
		if (thirst > 39 && thirst < 50) { // 40 to 49
			return "Dehydrated";
		}
		else if (thirst > 10 && thirst < 40) { // 11 to 39
			return "Thirsty";
		}
		else if (thirst > 49) { // 50+
			return "Dead";
		}
		else { // 0 to 10
			return "Hydrated";
		}
	}
	public String selfServe() {
		dispo -= 10;
		if ((hunger > (50 - energy)) || (thirst > (50 - energy))){
			if (hunger > thirst) {
				feedPet(5);
				return "hungry";
			}
			else {
				giveWater();
				return "thirsty";
			}
		}
		else {
			return "tired";
		}
	}
	public String getDispo() {
		if (dispo > 0 && dispo < 11) { // 1 to 10
			return "Hated";
		}
		else if (dispo > 10 && dispo < 40) { // 11 to 39
			return "Liked";
		}
		else if (dispo < 1) { // 0-
			return "Ran Away";
		}
		else { //40 to 50
			return "Loved";
		}
	}
	public void takeNap(int i) {
		energy -= (i*5);
	}
	
	public String getEnergy() {
	if (energy < 11) { // 1 to 10
		return "Tired";
	}
	else if (energy > 10 && energy < 40) { // 11 to 39
		return "Active";
	}
	else { //40 to 50
		return "Hyper";
	}
	
}
	
	public void tick() {
		if (hunger > 0) {
			hunger += 3;
		}
		if (thirst > 0) {
			thirst += 5;
		}
		if (energy > 50) {
			energy = 50;
		}
		if (energy < 0) {
			energy = 0;
		}
	}
}

