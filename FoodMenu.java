import java.util.ArrayList;
import java.util.List;

public class FoodMenu extends Food{

    //variables
    private List<Food> menu;

    //constructor
    public FoodMenu(){
        menu = new ArrayList<>();
        menu.add(new Food("Hamburger", "A juicy 1/3 Pound beef burger!", 4 ));
        menu.add(new Food("HotDog", "Crispy frank with all your desired toppings!", 3));
        menu.add(new Food("FrenchFries", "Golden brown french fries topped with salt and pepper!", 2));
    }

    //methods
    public Food getFood(int index){
        Food food = null;
        int trueIndex = index - 1;
        try {
             if(trueIndex <= menu.size() && trueIndex >= 0){
                    food = menu.get(trueIndex);
//                    System.out.println(food);
            }
        }  catch(IndexOutOfBoundsException e){
            System.out.println("Looks like that item number is invalid, please make another selection!");
        } return food;
    }

    public Food getCheapestFood(){
        Food cheapestFood = null;
        for(int i = 0; i < menu.size(); i++){
            if(cheapestFood == null){
                cheapestFood = menu.get(i);
            } else if(cheapestFood.getPrice() > menu.get(i).getPrice() ){
                cheapestFood = menu.get(i);
            }
        } System.out.println(cheapestFood.toString());
        return cheapestFood;
    }

    //toString
    @Override
    public String toString(){;
        String fullMenuString = "";
        for(int i = 0; i < menu.size(); i++){
            fullMenuString += i + 1 + ". " + menu.get(i).toString() + '\n';
        }
        return fullMenuString;
    }
}