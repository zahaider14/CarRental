package rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClientTest {

  private Client c1;
  private Client c2;

  @Before
  public void before() {
    this.c1 = new Client("Bob", 22);
    this.c2 = new Client("Mike", 33);
  }

  @Test
  public void testCreation() {
    assertNotNull(this.c1);
  }

  @Test
  public void testGetName() {
    assertEquals(this.c1.getName(), "Bob");
  }

  @Test
  public void getAgeTest() {
    assertEquals(this.c1.getAge(), 22);
  }

  @Test
  public void testEquals() {
    assertTrue(this.c1.equals(new Client("Bob", 22)));
    assertFalse(this.c1.equals(this.c2));
  }






  // ---Pour permettre l'execution des tests ----------------------
  public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(rental.ClientTest.class);
  }
}
