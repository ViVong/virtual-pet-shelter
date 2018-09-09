package virtualpet;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class VirtualPetApp {

	public static void main(String[] args) {
		int choice;
		VirtualPet dog = new VirtualPet();
		Scanner input = new Scanner(System.in);
		System.out.println("What kind of pet do you want?");
		dog.animal = input.next();
		System.out.println("What is your pet's name?");
		dog.name = input.next();
		while( !dog.getHunger().equals("Dead") && !dog.getThirst().equals("Dead") && !dog.getDispo().equals("Ran Away")) {
			choice = 0;
			System.out.printf("\n%s the %s\nHunger: %s\nThirst: %s\nDisposition: %s\nEnergy: %s\n\n", dog.name, dog.animal, dog.getHunger(), dog.getThirst(), dog.getDispo(),dog.getEnergy());
			while (choice < 1 || choice > 5) {
				System.out.println("1. Feed " + dog.name + "\n2. Give Water\n3. Take a nap\n4. Let " + dog.name + " decide.\n5. Quit\nWhat do you want to do?");
				choice = Integer.parseInt(input.next());
				if (choice < 1 || choice > 5) {
					System.out.println("Invalid choice: Please try again.");
				}
				if (dog.getEnergy().equals("Tired") && choice != 3) {
					System.out.println(dog.name + " is too tired and needs a nap.");
					choice = 0;
				}
			}
			if (choice == 1) {
				choice = 0;
				while (choice < 1 || choice > 3) {
					System.out.println("1. Gruel\n2. Slop\n3. Oatmeal\nWhat do you want to feed " + dog.name + "?");
					choice = Integer.parseInt(input.next());
					if (choice < 1 || choice > 3) {
						System.out.println("Invalid choice: Please try again.");
					}
				}
					System.out.println("You feed " + dog.name + " some food.");
					dog.feedPet(choice*3);
			}
			else if (choice == 2) {
				System.out.println("You give " + dog.name + "water to drink.");
				dog.giveWater();
			}
			else if (choice == 3) {
				System.out.println("How long do you want to nap for? (Each hour will recover Energy but tick)");
				choice = Integer.parseInt(input.next());
				dog.takeNap(choice);
			}
			else if (choice == 4) {
				dog.selfServe();
			}
			else {
				System.exit(0);
			}
			dog.tick();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();			
				}
		}
		if (dog.getHunger().equals("Dead")) {
			System.out.println("Your " + dog.animal + " died from because you forgot to feed it.");
		}
		if (dog.getThirst().equals("Dead")) {
			System.out.println("Your " + dog.animal + "died from the opposite of drowning.");
		}
		if (dog.getDispo().equals("Ran Away")) {
			System.out.println("Your " + dog.animal + " ran away because you are a terrible owner.");
		}

	}

}
