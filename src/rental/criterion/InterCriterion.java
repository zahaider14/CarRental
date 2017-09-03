package rental.criterion;

import java.util.List;
import java.util.ArrayList;
import rental.vehicles.*;

/**
* Criterion satisfied if each of its criterion are satisfied.
*/
public class InterCriterion implements Criterion {

  /** The list of considered criterions */
  private List<Criterion> criterions;

  /** Constructor for the InterCriterion */
  public InterCriterion() {
    this.criterions = new ArrayList<Criterion>();
  }

  /**
  * Add a criterion to the List
  * @param c the criterion to add to the list
  */
  public void addCriterion(Criterion c) {
    this.criterions.add(c);
  }

  /**
  * @see Criterion#IsSatisfiedBy(Vehicle)
  */
  public boolean isSatisfiedBy(Vehicle v) {
    boolean res = true;

    for(Criterion c : criterions) {
      if(!c.isSatisfiedBy(v)) {
        res = false;
      }
    }

    return res;
  }
}
