package Characters;

import java.util.ArrayList;

public abstract class Characters {
     protected String name;
     protected String weapon;
     protected int health;
     protected ArrayList<String>  weapons;

    public Characters(String name, String weapon, int health){
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        this.weapons = new ArrayList<>();
    }

    public String getName(){
        return  this.name;
    }

    public String getWeapon(){
        return  this.weapon;
    }

    public int getHealth(){
        return  this.health;
    }

    public void addWeapon(String weapon) {
        this.weapons.add(weapon);
    }

    public int weaponCount(){
        return this.weapons.size();
    }
}
