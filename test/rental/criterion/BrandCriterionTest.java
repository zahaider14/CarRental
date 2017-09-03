package rental.criterion;

import static org.junit.Assert.*;
import org.junit.Test;

import rental.vehicles.*;

public class BrandCriterionTest {

  @Test
  public void testCreation() {
    assertNotNull(new BrandCriterion("brand1"));
  }

  @Test
  public void testIsSatisfiedBy() {
    BrandCriterion bc = new BrandCriterion("Honda Motors");
    Vehicle v1 = new Vehicle("Honda Motors", "model", 2016, 100);
    Vehicle v2 = new Vehicle("Volvo", "model", 2014, 90);
    assertTrue(bc.isSatisfiedBy(v1));
    assertFalse(bc.isSatisfiedBy(v2));
  }


  // ---Pour permettre l'execution des tests ----------------------
  public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(rental.criterion.BrandCriterionTest.class);
  }
}
