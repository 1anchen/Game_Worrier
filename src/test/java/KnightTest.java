import Characters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

 public class KnightTest {

   Knight knight;

    @Before
    public void before(){
        this.knight= new Knight("SirChopSticts","Sword",200);
    }

    @Test
    public void canGetName(){
        assertEquals("SirChopSticts",knight.getName());
    }

    @Test
    public void canGetWeapon(){
        assertEquals("Sword",knight.getWeapon());
    }

    @Test
    public void canGetHealth(){
        assertEquals(200,knight.getHealth());
    }

    @Test
    public void canAddWeapon(){
        assertEquals(0,knight.weaponCount());
        knight.addWeapon("Dagger");
        assertEquals(1,knight.weaponCount());
    }

     @Test
     public void canSwitchWeapon(){
         knight.addWeapon("Dagger");
         assertEquals("Dagger",knight.drawWeapon());
     }



}

