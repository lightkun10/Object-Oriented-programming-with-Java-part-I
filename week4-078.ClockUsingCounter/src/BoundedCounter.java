public class BoundedCounter {
  // OBJECT VARIABLE
  private int value = 0; // 'counter', start from 0
  private int upperLimit; // defined by constructor parameter

  // OBJECT CONSTRUCTOR
  public BoundedCounter(int upperLimit) {
    this.upperLimit = upperLimit;
  }

  // OBJECT METHODS
  public void next() {
    if (this.value < this.upperLimit) {
      this.value++;
    } else if (this.value >= this.upperLimit) {
      this.value = 0;
    }
  }

  public String toString() {
    if (this.value < 10) {
      return "0" + this.value;
    }
    return "" + this.value;
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    if (value >= 0 && value <= upperLimit) {
      this.value = value; // use void if your are not returning anything
    }
  }

}