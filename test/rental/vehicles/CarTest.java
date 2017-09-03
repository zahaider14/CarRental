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
		this.c2 = new Car("brand2","model2",2000,200.0f, 3);
  }

  @Test
  public void createTest() {
    assertNotNull(this.c1);
  }
  
}
