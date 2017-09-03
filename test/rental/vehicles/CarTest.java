package rental.vehicles;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

  private Car c1;
  private Car c2;

  @Before
  public void before() {
    this.c1 = new Car("brand1","model1",2015,100.0f, 5);
		this.c2 = new Car("brand2","model 2",2000,200.0f, 3);
  }

  @Test
  public void createTest() {
    assertNotNull(this.c1);
  }

  @Test
  public void testGetBrand() {
    assertEquals("brand1", this.c1.getBrand());
  }

  @Test
  public void testGetModel() {
    assertEquals("model 2", this.c2.getModel());
  }

  @Test
  public void testGetDailyPrice() {
    assertEquals(this.c1.getDailyPrice(), 100.0f, 0.0001);
  }

  @Test
  public void testGetProductionYear() {
    assertEquals(this.c2.getProductionYear(), 2000);
  }

  @Test
  public void testGetNbPassengers() {
    assertEquals(this.c1.getNbPassengers(), 5);
  }

  @Test
  public void testEquals() {
    Car c3 = new Car("brand1","model1",2015,100.0f, 5);
    assertTrue(c3.equals(c1));
    assertFalse(c1.equals(c2));
    assertFalse(c1.equals(new Object()));
  }

  public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(rental.vehicles.CarTest.class);
  }

}
