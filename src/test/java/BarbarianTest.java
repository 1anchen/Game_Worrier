import Characters.Barbarian;
import org.junit.Before;
import org.junit.Test;

        import static org.junit.Assert.assertEquals;

 public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        this.barbarian = new Barbarian("BigBear","Club",150);
    }

    @Test
    public void canGetName(){
        assertEquals("BigBear",barbarian.getName());
    }

    @Test
    public void canGetWeapon(){
        assertEquals("Club",barbarian.getWeapon());
    }

    @Test
    public void canGetHealth(){
        assertEquals(150,barbarian.getHealth());
    }

    @Test
    public void canAddWeapon(){
        assertEquals(0,barbarian.weaponCount());
        barbarian.addWeapon("Axe");
        assertEquals(1,barbarian.weaponCount());
    }

     @Test
     public void canSwitchWeapon(){
         barbarian.addWeapon("Axe");
         barbarian.drawWeapon();
         assertEquals("Axe",barbarian.drawWeapon());
     }




}

