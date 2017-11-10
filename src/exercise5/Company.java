package exercise5;

/**
 * Class Company
 * Task 4: Create a class Company with the following private data members: String name, double stockPrice. Implement a setter method for the stockPrice.
 * @author yasiro01
 */
public class Company {
  private String name;
  private double stockPrice;
  
  public Company(String name, double stockPrice){
      this.name= name;
      this.stockPrice=00.00;
      this.stockPrice= stockPrice;    
  }
  public String getName(){
      return name;
  }
  public double getStockPrice() {
      return stockPrice;
  }
  
  public void setStockPrice(double stockPrice){
      this.stockPrice=stockPrice;
  }
  @Override
  public String toString(){
     return name + " trading at $"+ Double.toString(stockPrice)+"0";
    }
}
