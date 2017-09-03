package rental.vehicles;

/**
* A class definig the characteristics of a motorbike.
*/
public class Motorbike extends Vehicle {

  /**
  * The power of the motorbike
  */
  private int power;

  /**
  * Constructor for a motorbike vehicle.
  */
  public Motorbike(String b, String m, int py, float drp, int p) {
    super(b, m, py, drp);
    this.power = p;
  }

  /**
  * Get the power of the motorbike
  * @return the power of the motorbike
  */
  public int getPower() {
    return this.power;
  }

  /**
  * Returns a String representation of the motorbike
  * @return the string
  */
  public String toString() {
    return super.toString() + " Power: " + this.getPower() + ".";
  }

  /**
  * @see java.lang.Object#equals(java.lang.Object)
  */
  public boolean equals(Object o) {
    if(o instanceof Motorbike) {
      Motorbike other = (Motorbike) o;
      return this.getBrand().equals(other.getBrand())
        && this.getModel().equals(other.getModel())
        && this.getProductionYear() == other.getProductionYear()
        && this.getDailyPrice() == other.getDailyPrice()
        && this.power == other.getPower();
    }
    else {
      return false;
    }
  }
}
