package virtualpet;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class VirtualPetApp {

	public static void main(String[] args) {
		int choice;
		VirtualPet dog = new VirtualPet();
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Virtual Pet.\nWould you like to adopt a new pet? Y/N");
		if ( !input.next().toLowerCase().equals("y")) {
			System.exit(0);
		}
		System.out.println("How to play:\nTry to keep your pet happy and have its needs met.\nYour pet will need energy to eat or drink.\nLetting the pet decide will lower dispostion but decreased other values but more.\nIf hunger/thirst get too high (50) or dispostion gets too low (0) it's Game Over.\nPlease type anything to continue.");
		input.next();
		
		System.out.println("What will you name your pet?");
		dog.name = input.next();
		System.out.println("What kind of animal is your pet?");
		dog.animal = input.next();
		
		//Game loop will run as long as hunger/thirst/disposition does not equal 0
		while( !dog.getHunger().equals("Dead") && !dog.getThirst().equals("Dead") && !dog.getDispo().equals("Ran Away")) {
			choice = 0;
			System.out.printf("\n%s the %s\nHunger: %s (%d)\nThirst: %s (%d)\nDisposition: %s (%d)\nEnergy: %s (%d)\n\n", dog.name, dog.animal, dog.getHunger(), dog.getHungerNum(), dog.getThirst(), dog.getThirstNum(), dog.getDispo(), dog.getDispoNum(), dog.getEnergy(), dog.getEnergyNum());
			
			//Prompt user what to do and loops if not within parameters.
			while (choice < 1 || choice > 5) {
				System.out.println("1. Feed " + dog.name + "\n2. Give Water\n3. Take a nap\n4. Let " + dog.name + " decide.\n5. Quit\nWhat do you want to do?");
				choice = Integer.parseInt(input.next());
				if (choice < 1 || choice > 5) {
					System.out.println("Invalid choice: Please try again.");
				}
				//If energy is 0 then you are forced to loop until you take a nap.
				if (dog.getEnergy().equals("Exhausted") && choice != 3) {
					System.out.println(dog.name + " is exhausted and needs to rest.");
					choice = 0;
					//Pauses program for 2 seconds
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();			
					}
				}
			}
			//Prompts users to pick between several food options.
			if (choice == 1) {
				choice = 0;
				while (choice < 1 || choice > 3) {
					System.out.println("1. Gruel\n2. Slop\n3. Oatmeal\nWhat do you want to feed " + dog.name + "?");
					choice = Integer.parseInt(input.next());
					if (choice < 1 || choice > 3) {
						System.out.println("Invalid choice: Please try again.");
					}
				}
				//Uses a random integer to determine which food the pet like most today.
				if (random.nextInt(3)+1 == choice){
					System.out.println( dog.name + " likes your choice of food today and eats happily.");
					dog.feedPet(12);
				}
				else {
					System.out.println( dog.name + " is neutral about the food you chose today.");
					dog.feedPet(6);
				}
			}
			//Calls different methods based on choice made earlier.
			else if (choice == 2) {
				System.out.println("You give " + dog.name + " water to drink.");
				dog.giveWater();
			}
			else if (choice == 3) {
				System.out.println("How long do you want to nap for? (Each hour will recover Energy but tick)");
				choice = Integer.parseInt(input.next());
				dog.takeNap(choice);
			}
			else if (choice == 4) {
				System.out.println( dog.name + " decided they were " + dog.selfServe());
			}
			else {
				System.exit(0);
			}
			dog.tick();
			//Pauses program for 2 seconds
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();			
			}
		}
		//Outputs GAME OVER and tells which variable caused the loop to end.
		if (dog.getHunger().equals("Dead")) {
			System.out.println("\nYour " + dog.animal + " died from because you forgot to feed it.\nGAME OVER");
		}
		if (dog.getThirst().equals("Dead")) {
			System.out.println("\nYour " + dog.animal + " died from the opposite of drowning.\nGAME OVER");
		}
		if (dog.getDispo().equals("Ran Away")) {
			System.out.println("\nYour " + dog.animal + " ran away because it felt you didn't care enough.\nGAME OVER");
		}

	}

}
