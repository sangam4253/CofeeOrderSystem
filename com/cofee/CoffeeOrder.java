package cofee;

public class CoffeeOrder {
    private String customerName;
    private String coffeeType;
    private String cupSize;
    private double price;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }
    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }
    public void setPrice(double price) {
        this.price = price;
    }
     public String getCustomerName(){
        return customerName;
     }
     public String getCoffeeType(){
        return coffeeType;
     }
     public String getCupSize(){
        return cupSize;
     }
     public double getPrice(){
        return price;
     }
     public String getOrderMessage() {
         return " Order placed for " + customerName + ":" + coffeeType;
     }
     public static void main(String[] args) {
         CoffeeOrder order1 = new CoffeeOrder();
         order1.setCustomerName("Rahul Sharma");
         order1.setCoffeeType("Cappuccino");
         order1.setCupSize("Medium");
         order1.setPrice(120.0);
         CoffeeOrder order2 = new CoffeeOrder();
         order2.setCustomerName("Priya Nair");
         order2.setCoffeeType("Latte");
         order2.setCupSize("Large");
         order2.setPrice(150.0);
         System.out.println("Order 1 Details");
         System.out.println("Customer Name : "+order1.getCustomerName());
         System.out.println("Coffee Type : "+order1.getCoffeeType());
         System.out.println("Cup Size : "+order1.getCupSize());
         System.out.println("Price : "+order1.getPrice());
         System.out.println("Order Message"+":"+order1.getOrderMessage());
         System.out.println("-----------------------------------");
         System.out.println("Order 2 Details");
         System.out.println("Customer Name : "+order2.getCustomerName());
         System.out.println("Coffee Type : "+order2.getCoffeeType());
         System.out.println("Cup Size : "+order2.getCupSize());
         System.out.println("Price : "+order2.getPrice());
         System.out.println("Order Message"+":" +order2.getOrderMessage());

    }


}
