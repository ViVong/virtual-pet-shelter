package virtualpetshelter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VirtualPetShelterTest {
	
		@Test
		public void shouldOutputAllPetsThenOnePet() {
			VirtualPetShelter test = new VirtualPetShelter();
			test.admit("Fido", "a fine pupper.");
			test.admit("Diaper", "a stinky doggo.");
			test.allPets();
			test.onePet("Diaper");
		}
		
		@Test
		public void shouldFeedAllPets() {
			
		}
}
