
public class NumberStatistics {
  // OBJECT VARIABLES .. FIELDS
  private int amountOfNumbersAdded;
  private int sumOfNum;

  // OBJECT CONSTRUCTOR
  public NumberStatistics() {
    this.amountOfNumbersAdded = 0;
  }

  // OBJECT METHODS
  public void addNumber(int number) {
    this.amountOfNumbersAdded++;
    this.sumOfNum += number;
  }

  public int amountOfNumbers() {
    return this.amountOfNumbersAdded;
  }

  public int sum() {
    return this.sumOfNum;
  }

  public double average() {
    if (this.sumOfNum == 0)
      return 0;
    else
      return (double) this.sumOfNum / (double) this.amountOfNumbersAdded;
  }

}
