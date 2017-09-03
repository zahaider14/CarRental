package rental.vehicles;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MotorbikeTest {

  private Motorbike m1;

  @Before
  public void before() {
    this.m1 = new Motorbike("brand 1", "model 1", 2016, 70.0f, 120);
  }

  @Test
  public void testCreate() {
    assertNotNull(this.m1);
  }

  @Test
	public void testGetBrand() {
		assertEquals("brand 1",this.m1.getBrand());
	}

	@Test
	public void testGetModel() {
		assertEquals("model 1",this.m1.getModel());
	}

	@Test
	public void testGetDailyPrice() {
	    assertEquals(70.0f,this.m1.getDailyPrice(),0.0001);
	}

	@Test
	public void testGetProductionYear() {
	    assertEquals(2016,this.m1.getProductionYear());
	}

  @Test
	public void testGetPower() {
		assertEquals(m1.getPower(), 120);
	}

  @Test
  public void testEquals() {
    Motorbike m2 = new Motorbike("brand 1", "model 1", 2016, 70.0f, 120);
    assertTrue(m1.equals(m2));
    Motorbike m3 = new Motorbike("brand 1", "model 1", 2016, 80.0f, 120);
    assertFalse(m1.equals(m3));
  }


  // ---Pour permettre l'execution des tests ----------------------
  public static junit.framework.Test suite() {
     return new junit.framework.JUnit4TestAdapter(rental.vehicles.MotorbikeTest.class);
  }

}
