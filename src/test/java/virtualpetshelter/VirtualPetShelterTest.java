package virtualpetshelter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VirtualPetShelterTest {
	
		@Test
		public void shouldAdmitThenOutputAllPets() {
			VirtualPetShelter test = new VirtualPetShelter();
			test.admit("Fido", "a fine pupper.");
			test.admit("Diaper", "a stinky doggo.");
			//test.allPets();
		}
		
		@Test
		public void shouldAdoptThenOutputAllPets() {
			VirtualPetShelter test = new VirtualPetShelter();
			test.admit("Fido", "a fine pupper.");
			test.admit("Diaper", "a stinky doggo.");
			test.adopt("Fido");
			//test.allPets();
		}
		
		@Test
		public void shouldFeedAllPets() {
			VirtualPetShelter test = new VirtualPetShelter();
			test.admit("Fido", "a fine pupper.");
			test.admit("Diaper", "a stinky doggo.", 93, 12, 1);
			test.feedPets();
			assertEquals(test.onePet("Fido").getHunger(), 25);
			assertEquals(test.onePet("Diaper").getHunger(), 88);
		}
		
		@Test
		public void shouldWaterAllPets() {
			VirtualPetShelter test = new VirtualPetShelter();
			test.admit("Fido", "a fine pupper.");
			test.admit("Diaper", "a stinky doggo.", 93, 12, 1);
			test.waterPets();
			assertEquals(test.onePet("Fido").getThirst(), 25);
			assertEquals(test.onePet("Diaper").getThirst(), 7);
		}
		
		@Test
		public void shouldPlayWithOnePet() {
			VirtualPetShelter test = new VirtualPetShelter();
			test.admit("Fido", "a fine pupper.");
			test.admit("Diaper", "a stinky doggo.", 93, 12, 1);
			test.playWith("Fido");
			assertEquals(test.onePet("Fido").getDispo(), 30);
			assertEquals(test.onePet("Diaper").getDispo(), 1);
		}
		
		@Test
		public void shouldCleanPetPen() {
			VirtualPetShelter test = new VirtualPetShelter();
			test.admit("Fido", "a fine pupper.");
			test.admit("Diaper", "a stinky doggo.", 93, 12, 1);
			test.cleanCage("Fido");
			assertEquals(test.onePet("Fido").getClean(), 90);
			assertEquals(test.onePet("Diaper").getClean(), 50);
		}
		
		@Test
		public void shouldTickAllPets() {
			VirtualPetShelter test = new VirtualPetShelter();
			test.admit("Fido", "a fine pupper.");
			test.admit("Diaper", "a stinky doggo.", 93, 12, 1);
			test.tick();
			assertEquals(test.onePet("Fido").getHunger(), 32);
			assertEquals(test.onePet("Diaper").getHunger(), 95);
			assertEquals(test.onePet("Fido").getThirst(), 33);
			assertEquals(test.onePet("Diaper").getThirst(), 15);
			assertEquals(test.onePet("Fido").getDispo(), 19);
			assertEquals(test.onePet("Diaper").getDispo(), 0);
			test.allPets();
		}
}
