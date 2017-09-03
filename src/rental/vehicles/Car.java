package rental.vehicles;

public class Car extends Vehicle {

  /**
  * The nb of passengers the can can take
  */
  private int nb_passengers;

  /**
  * Constructor for a Car
  */
  public Car(String b, String m, int py, float drp, int nbp) {
    super(b, m, py, drp);
    this.nb_passengers = nbp;
  }

  /**
  * Returns the nb of passengers allowed in the car
  * @return the nb of passengers
  */
  public int getNbPassengers() {
    return this.nb_passengers;
  }

  /**
  * Returns a String representation of the car
  *
  * @return the string representing the car
  */
  public String toString() {
    return super.toString() + " " + this.getNbPassengers() + " passengers.";
  }
}
