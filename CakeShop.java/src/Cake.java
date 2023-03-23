//Student Name: Hoa Nguyen
//LSU ID: 896317475
public class Cake implements Comparable<Cake> {
    private String flavor;
    private int tiers;
    private double price;

    public Cake(String Flavor, int Tiers, double Price) {
        flavor = Flavor;
        tiers = Tiers;
        price = Price;
    }

    /*
     * printCard() - prints Cake cards into the console
     */
    public void printCard() {
        System.out.printf("A %d tier %s cake\t\t$%.2f\n", tiers, flavor, price);
    }

    /*
     * compareTo() - compares Cakes by flavor, and if flavors are the same, compares
     * by price
     * 
     * @param other the other Cake object to compare
     * 
     * @return -1, 0, or 1
     */
    public int compareTo(Cake other) {
        if (flavor.compareTo(other.flavor) != 0) {
            return -flavor.compareTo(other.flavor);
        } else {
            return -Double.compare(price, other.price);
        }

    }

}
