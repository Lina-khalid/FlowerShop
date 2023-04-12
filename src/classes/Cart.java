package classes;

import java.util.ArrayList;

// Subclass of superclass(Order)
public class Cart extends Flower {

   double total;
    double tax;
    ArrayList<Flower> customerOrder = new ArrayList<>();

    public Cart(double total) {
        this.total = total;
    }
    

    public Cart(ArrayList<Flower> customerOrder) {
        this.customerOrder=customerOrder;
    }
    
    // This method is responsible to calculate the total of the customerOrder 
    public double calculateTotal() {
        // Loop to get the price and quantity of each type 
        for (int i = 0; i < customerOrder.size(); i++) {
            double t = customerOrder.get(i).QTY * customerOrder.get(i).price;
            total += t;
        }
        return total;
    }

    // This method is responsible to calculate the total with Tax 
    public double calculateTax() {
        return (total * 0.15) + total;
    }

    @Override
    // This method is responsible to generate the customerOrder details
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\t" + "~~ Tayp ~~" + "\t      " + "~~Quantity ~~" + "\t\t" + "~~ Price ~~\n\n");
        if (customerOrder != null) {
            for (int i = 0; i < customerOrder.size(); i++) {
                // print the customerOrder (type , quantity and price)
                str.append("\t").append(customerOrder.get(i).type).append("\t\t").append(customerOrder.get(i).QTY).append("\t\t").append(customerOrder.get(i).price * customerOrder.get(i).QTY).append("  SR\n\n");

            }
        }

        return str.toString();
    }

}
