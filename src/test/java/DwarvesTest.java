import Characters.Dwarves;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarvesTest {

    Dwarves dwarves;

    @Before
    public void before(){
        this.dwarves = new Dwarves("Gaintstone","Axe",100);
    }

    @Test
    public void canGetName(){
        assertEquals("Gaintstone",dwarves.getName());
    }

    @Test
    public void canGetWeapon(){
        assertEquals("Axe",dwarves.getWeapon());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100,dwarves.getHealth());
    }

    @Test
    public void canAddWeapon(){
        assertEquals(0,dwarves.weaponCount());
        dwarves.addWeapon("Sword");
        assertEquals(1,dwarves.weaponCount());
    }

    @Test
    public void canSwitchWeapon(){
        dwarves.addWeapon("Sword");
        dwarves.drawWeapon();
        assertEquals("Sword",dwarves.drawWeapon());
    }



}
