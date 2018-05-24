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

    public int countPotion(){
        return this.potions.size();
    }

    public String getPotion(){
        return this.potions.get(0);
    }

    public void deletePotion(){
        this.potions.remove(0);
    }


}
