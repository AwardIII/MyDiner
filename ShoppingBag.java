import javax.print.attribute.IntegerSyntax;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBag<T extends PricedItem<Integer>>{
    //variables
        private Map<T, Integer> shoppingBag;

    //constructors
        public ShoppingBag(){
            shoppingBag = new HashMap<>();
        }
    //methods
        public void addItem(T item){
            for(Map.Entry<T, Integer> entry: shoppingBag.entrySet()){
                if(item == entry.getKey()){
                    Integer newValue = entry.getValue();
                    newValue++;
                    entry.setValue(newValue);
                } else {
                    shoppingBag.put(item, 1);
                }
            }
        }

        public Integer getTotalPrice(){
            Integer totalPrice = 0;
            for(Map.Entry<T, Integer> entry: shoppingBag.entrySet()){
                T item = entry.getKey();
                int quantity = entry.getValue();
                int itemTotal = item.getPrice() * quantity;
                totalPrice += itemTotal;
            }
         return totalPrice;
        }
}