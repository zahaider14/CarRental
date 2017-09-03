package rental.criterion;

import rental.vehicles.*;

/**
* Interface describing a criterion to select a particular vehicle.
*/
public interface Criterion {

  /**
  * Checks if the criterion is verified.
  * @param v the vehicle to be checked
  * @return true if and only if the vehicle v is in accordance with the criterion.
  */
  public boolean isSatisfiedBy(Vehicle v);

}
