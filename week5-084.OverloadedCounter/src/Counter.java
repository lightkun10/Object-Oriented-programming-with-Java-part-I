public class Counter {
  // OBJECT VARIABLES .. FIELDS
  private int value;
  private boolean check;

  // OBJECT CONSTRUCTOR
  public Counter(int startingValue, boolean check) {
    this.value = startingValue;
    this.check = check;
  }

  public Counter(int startingValue) {
    this(startingValue, false);
  }

  public Counter(boolean check) {
    this(0, check);
  }

  public Counter() {
    this(0, false);
  }

  // OBJECT METHODS
  public int value() {
    return this.value;
  }

  public void increase() {
    this.increase(1);
  }

  public void decrease() {
    if (this.check == true && this.value <= 0) {
      this.value = 0;
    } else {
      this.value--;
    }
  }

  public void increase(int increaseAmount) {
    if (increaseAmount < 0) {
      increaseAmount = 0;
    }

    this.value += increaseAmount;
  }

  public void decrease(int decreaseAmount) {
    if (this.check == true) {
      if (this.value < decreaseAmount) {
        this.value = 0;
        decreaseAmount = 0;
      }
    } else if (decreaseAmount < 0) {
      decreaseAmount = 0;
    }

    this.value -= decreaseAmount;
  }

}