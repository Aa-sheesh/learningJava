public class Bike {
    private String model;
    private String color;
    private int price;

    Bike(String model,String color, int price){
        this.model=model;
        this.color=color;
        this.price=price;
    }

    //GETTERS
    String getModel(){
        return model;
    }
    String getColor(){
        return color;
    }
    int getPrice(){
        return price;
    }

    //SETTERS
    void setModel(String m){
        this.model=m;
        System.out.println("Model changed successfully!");
    }
    void setColor(String c){
        this.color=c;
        System.out.println("Color changed successfully!");
    }
    void setPrice(int p){
        this.price=p;
        System.out.println("Price changed successfully!");
    }
}
