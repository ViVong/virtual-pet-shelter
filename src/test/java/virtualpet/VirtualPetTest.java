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
		assertTrue(dog.getHunger()==50);
		dog.setHunger(25);
		assertTrue(dog.getHunger()==25);
	}
}
