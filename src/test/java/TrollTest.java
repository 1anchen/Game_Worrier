
import Characters.Knight;
import Room.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Knight knight;

    @Before
    public void before(){
        this.troll= new Troll();
        this.knight= new Knight("SirChopSticts","Sword",200);
    }


    @Test
    public void canGetGold(){
        assertEquals(100,troll.getGold());
    }


    @Test
    public void canGetHealth(){
        assertEquals(100,troll.getHealth());
    }

    @Test
    public void canAttack(){
        troll.damage(knight.attack("Sword"));
        assertEquals(80,troll.getHealth());
    }



}