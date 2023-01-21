import java.util.ArrayList;

public  class Cake {
    String flavor;
    Ingredients ingrOption;
    int stock;
    double price;

    public String chosenFlavor(String optionFlavor){
        setFlavor(optionFlavor);
        return getFlavor();
    }
    public  void preparing(boolean auxCook){
        while (!auxCook){
            auxCook=true;
            if (auxCook){
                System.out.println("okay");
                break;
            }
        }
    }
    public   boolean cooked(){
        return false;
    }

    //-------------------default constructor, getters and setters------------------------
    public Cake(String flavor, Ingredients ingrOption, int stock, double price) {
        this.flavor = flavor;
        this.ingrOption = ingrOption;
        this.stock = stock;
        this.price = price;
    }
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Ingredients getIngredients() {
        return ingrOption;
    }

    public void setIngredients(Ingredients ingrOption) {
        this.ingrOption = ingrOption;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
