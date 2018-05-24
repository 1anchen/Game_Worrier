import Characters.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        this.wizard = new Wizard("Gandalf", "Staff", 125,"Lighting Strike","Dragon");
    }

    @Test
    public void canGetName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void canGetWeapon() {
        assertEquals("Staff", wizard.getWeapon());
    }

    @Test
    public void canGetHealth() {
        assertEquals(125, wizard.getHealth());
    }

    @Test
    public void canGetSpell(){
        assertEquals("Lighting Strike",wizard.getSpell());
    }

    @Test
    public void canGetPet(){
        assertEquals("Dragon",wizard.getPet());
    }

    @Test
    public void canAddWeapon() {
        assertEquals(0, wizard.weaponCount());
        wizard.addWeapon("Sword");
        assertEquals(1, wizard.weaponCount());
    }

    @Test
    public void canSwitchWeapon() {
        wizard.addWeapon("Sword");
        wizard.drawWeapon();
        assertEquals("Sword", wizard.drawWeapon());
    }


    @Test
    public void canAddSpell() {
        assertEquals(0, wizard.spellCount());
        wizard.addSpell("Holy Water");
        assertEquals(1, wizard.spellCount());
    }

    @Test
    public void canSwitchSpell() {
        wizard.addSpell("Holy Water");
        assertEquals("Holy Water", wizard.changeSpell());
    }

    @Test
    public void canAddPet() {
        assertEquals(0, wizard.petCount());
        wizard.addPet("Eagle");
        assertEquals(1, wizard.petCount());
    }

    @Test
    public void canSwitchPet() {
        wizard.addPet("Eagle");
        assertEquals("Eagle", wizard.changePet());
    }
}
