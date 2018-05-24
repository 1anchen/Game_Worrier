package Characters;
import Interface.ISpellAndPet;
import Interface.IWeapon;

import java.util.ArrayList;


public class Warlock  extends Characters implements IWeapon, ISpellAndPet {

    protected String spell;
    protected String pet;
    protected ArrayList<String> spells;
    protected ArrayList<String> pets;

    public Warlock(String name, String weapon, int health, String spell, String pet) {
        super(name, weapon, health);
        this.spell = spell;
        this.pet = pet;
        this.spells = new ArrayList<>();
        this.pets = new ArrayList<>();

    }

    public String drawWeapon() {
        String newWeapon = weapons.get(0);
        return newWeapon;
    }

    public String getSpell() {
        return this.spell;
    }

    public String getPet() {
        return this.pet;
    }

    public void addSpell(String spell) {
        this.spells.add(spell);
    }

    public int spellCount(){
        return this.spells.size();
    }

    public void addPet(String pet) {
        this.pets.add(pet);
    }

    public int petCount(){
        return this.pets.size();
    }

    public String changeSpell(){
        String newSpell = spells.get(0);

        return newSpell;

    }
    public String changePet(){
        String newPet = pets.get(0);

        return newPet;
    }
}
