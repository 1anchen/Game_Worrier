
import Room.Cleric;
import org.junit.Before;
import org.junit.Test;

        import static org.junit.Assert.assertEquals;

 public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){
        this.cleric= new Cleric();
    }


    @Test
    public void canGetPotion(){
        assertEquals("Healing Potion",cleric.getPotion());
    }


     @Test
     public void canDeletePotion(){
        cleric.deletePotion();
         assertEquals(2,cleric.countPotion());
     }



}
