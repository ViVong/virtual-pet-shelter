package virtualpet;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {
	
	@Test
	public void createVirtualPet() {
		VirtualPet dog = new VirtualPet();
	}
	
	@Test
	public void createVirtualPetWithName() {
		VirtualPet dog = new VirtualPet("Fido", "Dog");
		assertTrue(dog.name.equals("Fido"));
		assertTrue(dog.animal.equals("Dog"));
	}
	
	@Test
	public void setThenGetHunger() {
		VirtualPet dog = new VirtualPet();
		assertTrue(dog.getHunger().equals("Hungry"));
		dog.feedPet(-20); //Sets hunger to 40
		assertTrue(dog.getHunger().equals("Starving"));
		dog.feedPet(-10); //Sets hunger to 50
		assertTrue(dog.getHunger().equals("Dead"));
		dog.feedPet(40); //Sets hunger to 10
		assertTrue(dog.getHunger().equals("Full"));
	}
}
