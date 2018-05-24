package Room;

import Interface.IAttackAndDamage;

public class Troll implements IAttackAndDamage{

    protected int gold;
    protected int health;

    public Troll(){
        this.gold = 100;
        this.health = 100;
    }

    public int getGold(){
        return this.gold;
    }

    public int getHealth(){
        return this.health;
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
