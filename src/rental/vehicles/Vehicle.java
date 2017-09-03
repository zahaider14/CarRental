package rental.vehicles;

/**
* A class that defines the characteristics of a vehicle in general.
*/
public class Vehicle {

  private String brand;
  private String model;
  private int productionYear;
  private float dailyRentalPrice;

  /**
  * Creates a vehicle
  *
  * @param brand the vehicle's brand
  * @param model the vehicle's model
  * @param productionYear the vehicle's production year
  * @param dailyRentalPrice the price it costs to rent for a day
  */
  public Vehicle(String brand, String model, int productionYear, float dailyRentalPrice) {
    this.brand = brand;
    this.model = model;
    this.productionYear = productionYear;
    this.dailyRentalPrice = dailyRentalPrice;
  }

  /**
  * Gives the vehicle's brand name
  * @return the brand name
  */
  public String getBrand() {
    return this.brand;
  }

  /**
  * Gives the model of the vehicle
  * @return the model of the vehicle
  */
  public String getModel() {
    return this.model;
  }

  /**
  * Gives the production year of the vehicle
  * @return the production year
  */
  public int getProductionYear() {
    return this.productionYear;
  }

  /**
  * Gives the daily price for renting the vehicle
  * @return the daily price
  */
  public float getDailyPrice() {
    return this.dailyRentalPrice;
  }

  public String toString() {
    return this.brand + " " + this.model + " de " + this.productionYear + " au prix de " + this.dailyRentalPrice + " par jour.";
  }

  /**
  * @see java.lang.Object#equals(java.lang.Object)
  */
  public boolean equals(Object o) {
    if(o instanceof Vehicle) {
      Vehicle other = (Vehicle) o;
      return this.brand.equals(other.brand)
        && this.model.equals(other.model)
        && this.productionYear == other.productionYear
        && this.dailyRentalPrice == other.dailyRentalPrice;
    }
    else {
      return false;
    }
  }
}
