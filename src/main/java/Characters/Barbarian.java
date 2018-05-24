package Characters;
import Interface.IWeapon;

import java.util.ArrayList;

public class Barbarian extends Characters implements IWeapon{

    public Barbarian(String name, String weapon, int health){
        super(name,weapon,health);

    }

    public String drawWeapon(){
        String newWeapon = weapons.get(0);
        addWeapon(this.weapon);
        this.weapons.remove(0);
        return newWeapon;
    }
}