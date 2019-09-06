public class Reformatory {
  private int numberOfWeightMeasured = 0;

  public int weight(Person person) {
    // return the weight of the person
    this.numberOfWeightMeasured++;
    return person.getWeight();
  }

  public void feed(Person person) {
    person.setWeight(person.getWeight() + 1);
  }

  public int totalWeightsMeasured() {
    // returns the total number of times
    // weight been measured
    return this.numberOfWeightMeasured;
  }

}
