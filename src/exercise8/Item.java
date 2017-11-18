package exercise8;

/**
 * Class Item
 * @author yasiro01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;

  public Item(long id, String title, int quantity){
      this.id=id;
      this.title=title;
      this.quantity=quantity;
  }
  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
    if(this.quantity >0){
        return true;
    }
    else{
        return false;
    }
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
    if(isAvailable()){
        this.quantity -= 1;
    }
    else{
        System.out.println("Item not available");
    }
  }

  /**
   * Check in an item
   */
  public void checkin() {
      this.quantity += 1;
  }
  
  @Override
  public String toString() {
    if(getQuantity()>1){
        return "We have "+ getQuantity()+ " copies of "+ getTitle();
    }
    if(getQuantity()== 1){
      return "We have a copy of "+ getTitle(); 
  }
    else{
        return "We have no copies of "+ getTitle();
    }
  }

  
  public int getQuantity() {
        return quantity;
    }

  public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
  
    /**
     * Get the item information
     * @return item information, type-specific
     */
  public abstract String getInfo();
  
}
