package SyauqiAuliyaJTidurJS;


/**
 * Write a description of class Price here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Price {
    
    //public double rebate;
    public double price;
    public double discount;

    public Price (double price){
        this.price = price;
       // rebate = 0;
        discount = 0;
        
    }
    
    public Price(double price, double discount){
        this.price = price;
        this.discount = discount;
       // rebate = 0;
    }
    
    public String toString(){
        return /*"rebate: " + rebate + "\n" +*/ "price: " + price + "\n" + "discount: " + discount;
    }

 
}