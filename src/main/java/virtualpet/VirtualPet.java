package virtualpet;

public class VirtualPet {

//Name, Type of Animal, Hunger, Thirst, Disposition, Energy

	//Initializing Public & Private Variables
	public String name = "<Default>";
	public String animal = "<Animal>";
	private int hunger = 25;
	private int thirst = 25;
	private int dispo = 20;
	private int energy = 20;
	
	//Constructor with & without input
	public VirtualPet() {
	}
	
	public VirtualPet(String Name, String Pet) {
		name = Name;
		animal = Pet;
	}
	
	//Decreases hunger & Outputs hunger or numerically
	public void feedPet(int i) {
		hunger -= i;
		dispo += (i/2);
		thirst += 5;
		energy -= 5;
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
	
	public int getHungerNum() {
		return hunger;
	}

	//Decreases thirst + energy & Verbally/numerically outputs thirst
	public void giveWater() {
		thirst -= 15;
		energy -= 5;
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
	
	public int getThirstNum() {
		return thirst;
	}
	
	//Determines the lowest value changes it
	public String selfServe() {
		dispo -= 5;
		if ((hunger > (50 - energy)) || (thirst > (50 - energy))){
			if (hunger > thirst) {
				feedPet(15);
				return "hungry";
			}
			else {
				giveWater();
				giveWater();
				return "thirsty";
			}
		}
		else {
			energy += 10;
			return "tired";
		}
	}
	
	//Verbally or numerically outputs disposition.
	public String getDispo() {
		if (dispo > 0 && dispo < 11) { // 1 to 10
			return "Angry";
		}
		else if (dispo > 10 && dispo < 40) { // 11 to 39
			return "Content";
		}
		else if (dispo < 1) { // 0-
			return "Ran Away";
		}
		else { //40 to 50
			return "Loved";
		}
	}
	
	public int getDispoNum() {
		return dispo;
	}
	
	//Increases energy & returns energy value
	public void takeNap(int i) {
		hunger -= 3;
		thirst -= 5;
		for (int x = i; x!= 0; x--) {
			energy += 10;
			tick();
		}
	}
	
	public String getEnergy() {
		if (energy > 0 && energy < 6) { // 5 or less
			return "Tired";
		}
		else if (energy > 5 && energy < 40) { // 11 to 39
			return "Active";
		}
		else if (energy > 39) { //40 to 50
			return "Full of Energy";
		}
		else {
			return "Exhausted";
		}
	}
	
	public int getEnergyNum() {
		return energy;
	}
	
	//tick method
	public void tick() {
		if (hunger > 0) {
			hunger += 3;
		}
		else {
			hunger = 0;
		}
		if (thirst > 0) {
			thirst += 5;
		}
		else {
			thirst = 0;
		}
	}
}

