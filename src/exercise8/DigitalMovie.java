package exercise8;

import java.util.ArrayList;

/**
 * Class DigitalMovie
 * MediaLIbrary code 2
 * @author yasiro01
 */
public class DigitalMovie extends Movie {
  private String service;

  public DigitalMovie(String service, String director, int releaseYear, long id, String title, int quantity){
      super(director, releaseYear, id, title, quantity);
      this.service=service;
      
      
  }
  /**
   * Get the value of service
   * @return the value of service
   */
  public String getService() {
    return service;
  }
  
  @Override
  public void checkout() {
    this.quantity +=0;
  }

  @Override
  public void checkin() {
      this.quantity += 0;
  }

  /**
   * Set the value of service
   * @param service new value of service
   */
  public void setService(String service) {
    this.service = service;
  }

    @Override
    public String getInfo() {
        return this.title+ this.releaseYear+ " by "+ this.director+ "is available via "+ service;
    }
  
}
