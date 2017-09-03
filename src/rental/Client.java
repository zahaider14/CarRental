package rental;

/** represent clients of a rental agency, the names are supposed to be
 * unique then two Client objects with same name are considered equals
*/
public class Client {

  private String name;
  private int age;

  /**
  * Creates a client
  * @param name the name of the client
  * @param age his/her age
  */
  public Client(String n, int a) {
    this.name = n;
    this.age = a;
  }

  /**
  * Gives the client's name
  * @return the client's name
  */
  public String getName() {
    return this.name;
  }

  /**
  * Gives the client's age
  * @return the age
  */
  public int getAge() {
    return this.age;
  }

  


}
