package rental.vehicles;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

  private Vehicle v1;
  private Vehicle v2;

  @Before
  public void before() {
    this.v1 = new Vehicle("Brand1", "Model1", 1999, 100.0f);
    this.v2 = new Vehicle("brand2","model2",2000,200.0f);
  }

  @Test
  public void createTest() {
    assertNotNull(this.v1);
  }

  @Test
  public void testGetBrand() {
    assertEquals(this.v1.getBrand(), "Brand1");
  }

  @Test
  public void testGetModel() {
    assertEquals(this.v2.getModel(), "model2");
  }

  @Test
  public void testGetProductionYear() {
    assertEquals(this.v1.getProductionYear(), 1999);
  }

  @Test
  public void testGetDailyRentalPrice() {
    assertEquals(this.v2.getDailyPrice(), 200.0f, 0.0001);
  }

  @Test
  public void testEquals() {
    Vehicle v3 = new Vehicle("brand2","model2",2000,200.0f);
    assertTrue(this.v2.equals(v3));
    assertFalse(this.v2.equals(v1));
    assertFalse(v1.equals(new Object()));
  }


  public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(rental.vehicles.VehicleTest.class);
  }

}
