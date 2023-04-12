package classes;

public class Flower {

    // This class is responsible for ordering a flower from the shop
    
    String type; // flower type
    int QTY; // how many flower of this type
    double price; // the price of a single flower
   
  
  
    public Flower(){
        
    }
    public Flower(int QTY, String type, double price) {
        this.QTY = QTY;
        this.type = type;
        this.price = price;
    }

    public int getQTY() {
        return QTY;
    }

    public void setQTY(int QTY) {
        this.QTY = QTY;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   
}
