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
}
