
package Characters;
import Interface.IWeapon;



public class Knight extends Characters implements IWeapon{

    public Knight(String name, String weapon, int health){
        super(name,weapon,health);

    }

    public String drawWeapon(){
        String newWeapon = weapons.get(0);

        return newWeapon;
    }
}
