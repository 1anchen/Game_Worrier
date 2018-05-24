package Room;

import java.util.ArrayList;

public class Cleric {
    protected ArrayList<String> potions;

    public Cleric(){
        this.potions = new ArrayList<>();
        this.potions.add("Healing Potion");
        this.potions.add("Healing Hearb");
        this.potions.add("Healing Gel");
    }

    public String getPotion(){
        return this.potions.get(0);
    }
}
