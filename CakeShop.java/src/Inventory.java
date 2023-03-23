//Student Name: Hoa Nguyen
//LSU ID: 896317475

import java.util.ArrayList;
import java.util.Collections;

public class Inventory {

    ArrayList<Cake> myCakes = new ArrayList<>();

    /*
     * addCake() - adds a Cake object to the myCakes ArrayList
     * 
     * @param newCake the cake to add to myCakes
     */
    public void addCake(Cake newCake) {
        myCakes.add(newCake);
    }

    /*
     * listInventory() - prints the sorted Cakes
     */
    public void listInventory() {
        Collections.sort(myCakes);

        for (Cake c : myCakes)
            c.printCard();
    }
}
