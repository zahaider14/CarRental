package rental.criterion;

import rental.vehicles.*;

/**
* This criterion is satisfied if the vehicle is of the same brand as the criterion's brand.
*/
public class BrandCriterion implements Criterion {

  /**
  * The brand of the criterion.
  */
  private String brand;

  /**
  * Constructor of a criterion.
  * @param b the brand considered in the criterion.
  */
  public BrandCriterion(String b) {
    this.brand = b;
  }

  /**
  * Method that checks if the criterion is respected.
  * @return <code>true</code> if the vehicle's brand is the same as the required brand.
  * @see Criterion#isSatisfiedBy(Vehicle)
  */
  public boolean isSatisfiedBy(Vehicle v) {
    return this.brand.equals(v.getBrand());
  }
}
