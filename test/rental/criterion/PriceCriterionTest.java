package rental.criterion;

import static org.junit.Assert.*;
import org.junit.Test;

import rental.vehicles.*;

public class PriceCriterionTest {

  @Test
  public void testCreation() {
    assertNotNull(new PriceCriterion(100));
  }

  @Test
  public void testIsSatisfiedBy() {
    PriceCriterion pc = new PriceCriterion(150);
    Vehicle v1 = new Vehicle("brand1","model1",2015,100);
		Vehicle v2 = new Vehicle("brand2","model2",2000,200);
    assertTrue(pc.isSatisfiedBy(v1));
		assertFalse(pc.isSatisfiedBy(v2));
  }

  // ---Pour permettre l'execution des tests ----------------------
  public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(rental.criterion.PriceCriterionTest.class);
  }
}
