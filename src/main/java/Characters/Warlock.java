package Characters;
import Interface.IWeapon;


public class Warlock  extends Characters implements IWeapon {

    protected String spell;
    protected String pet;

    public Warlock(String name, String weapon, int health, String spell, String pet) {
        super(name, weapon, health);
        this.spell = spell;
        this.pet = pet;

    }

    public String drawWeapon() {
        String newWeapon = weapons.get(0);
        return newWeapon;
    }

}
