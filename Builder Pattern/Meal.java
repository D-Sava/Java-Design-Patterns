import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){

        float cost = 0.0f;

        for(Item item : items){
            cost += item.price();
        }

        return cost;

    }

    public void showItems(){

        for(Item item : items){
            System.out.println("\nItem: " +item.name());
            System.out.println("\nPacking: " +item.packing().pack());
            System.out.println("\nPrice: " +item.price());
        }
    }

}
