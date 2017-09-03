package rental.criterion;

import rental.vehicles.*;

/**
* A class the will allow us to select a vehicle according to its price.
*/
public class PriceCriterion implements Criterion {

  /**
  * The maximum price.
  */
  private int price;

  /**
  * Constructor for a price criterion.
  * @param p the max price
  */
  public PriceCriterion(int p) {
    this.price = p;
  }

  /**
  * @see Criterion#isSatisfiedBy(Vehicle)
  */
  public boolean isSatisfiedBy(Vehicle v) {
    return this.price > v.getDailyPrice();
  }
}
