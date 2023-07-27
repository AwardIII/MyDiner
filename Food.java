public class Food implements PricedItem<Integer> {



    //variables
    private String name;
    private String desc;
    private int price;

    //constructor
    public Food(String name, String desc, int price){
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Food() {
    }


    //getters
    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.desc;
    }
    @Override
    public Integer getPrice(){
        return this.price;
    }



    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    @Override
    public void setPrice(Integer price){
        this.price = price;
    }

    //toString
    @Override
    public String toString(){
        String foodDisplay = "Delicious " + name + ": " + desc + " -----> $" + price;
        return foodDisplay;
    }
}