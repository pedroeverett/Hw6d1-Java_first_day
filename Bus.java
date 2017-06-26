public class Bus {

  private String name;
  private Person[] passengers;

  public Bus(String name) {
    this.name = name;
    this.passengers = new Person[20];
  }

  public String getName() {
    return this.name;
  }

  public int passengerCount() {
    int numberOfPassangers = 0;

    for (Person passenger : this.passengers) {
      if (passenger != null) {
        numberOfPassangers++;
      }
    }

    return numberOfPassangers;
  }

  public boolean isBusFull() {
    return passengerCount() == this.passengers.length;
  }

  public void addPassanger(Person passenger) {
    if (isBusFull()) {
      return;
    }
    int index = passengerCount();
    this.passengers[index] = passenger;
  }

  


}