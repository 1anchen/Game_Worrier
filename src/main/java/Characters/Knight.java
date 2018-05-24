
package Characters;
import Interface.IAttackAndDamage;
import Interface.IWeapon;



public class Knight extends Characters implements IWeapon, IAttackAndDamage{

    public Knight(String name, String weapon, int health){
        super(name,weapon,health);

    }

    public String drawWeapon(){
        String newWeapon = weapons.get(0);

        return newWeapon;
    }

    public int attack(String weapon){
        if(weapon == "Sword") {
            return 20;
        }if(weapon == "Club") {
            return 10;
        }if(weapon == "Axe") {
            return 15;
        }if(weapon == "Staff") {
            return 10;
        } if(weapon == "Dagger") {
            return 15;
        }
        return 5;
    }
    public int damage(int damageValue){
        return this.health -= damageValue;

    }
}
