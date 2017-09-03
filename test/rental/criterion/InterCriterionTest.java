package rental.criterion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import rental.vehicles.*;

public class InterCriterionTest {

  private InterCriterion ic;

  @Test
  public void testInterCriterionCreation() {
    InterCriterion ic = new InterCriterion();
    assertNotNull(ic);
  }

  @Test
  public void testInterCriterionSatisfaction() {
    InterCriterion ic = new InterCriterion();
    BrandCriterion bc = new BrandCriterion("Toyota");
    PriceCriterion pc = new PriceCriterion(100);
    ic.addCriterion(pc);
    ic.addCriterion(bc);
    Vehicle v1 = new Vehicle("Toyota", "Yaris", 2015, 150);
    Vehicle v2 = new Vehicle("Toyota", "Yaris", 2015, 50);
    Vehicle v3 = new Vehicle("Mazda", "2", 2015, 50);

    assertTrue(ic.isSatisfiedBy(v2));
    assertFalse(ic.isSatisfiedBy(v1));
    assertFalse(ic.isSatisfiedBy(v3));
  }


  // ---Pour permettre l'execution des tests ----------------------
  public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(rental.criterion.InterCriterionTest.class);
  }

}
