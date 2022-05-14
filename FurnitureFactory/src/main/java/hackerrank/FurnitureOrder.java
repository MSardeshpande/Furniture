package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    private HashMap<Furniture, Integer> orders;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        orders = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        orders.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return orders;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float sum = 0f;
        for(Map.Entry<Furniture, Integer> entries: orders) {
            Furniture f = ordres.getKey();
            sum+= cost;
        }
        return sum;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        int c = 0;
        for(Map.Entry<Furniture, Integer> entries: orders) {
            Furniture f = ordres.getKey();
            if(f.label().equalsIgnoreCase(type.label()) && f.cost() == type.cost()) {
                c+=1;
            }
            
        }
        return c;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        float co = 0f;
        for(Map.Entry<Furniture, Integer> entries: orders) {
            Furniture f = ordres.getKey();
            if(f.label().equalsIgnoreCase(type.label()) && f.cost() == type.cost()) {
                co = f.cost();
            }
            
        }
        return co;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return -1;
    }
}
