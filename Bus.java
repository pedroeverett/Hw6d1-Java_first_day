public class Bus {

  private String name;
  private Person[] passenger;

  public Bus(String name) {
    this.name = name;
    this.passenger = new Person[20];
  }

  public String getName() {
    return this.name;
  }

  public int passengerCount() {
    int numberOfPassangers = 0;

    for (Person passenger : this.passenger) {
      if (passenger != null) {
        numberOfPassangers++;
      }
    }

    return numberOfPassangers;
  }


}