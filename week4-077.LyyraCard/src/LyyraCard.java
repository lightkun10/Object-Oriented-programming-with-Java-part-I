public class LyyraCard {
  // OBJECT VARIABLE .. OBJECT FIELDS
  private double balance;

  // OBJECT CONSTRUCTOR
  public LyyraCard(double startingBalance) {
    this.balance = startingBalance;
  }

  // OBJECT METHODS
  public String toString() {
    return "The card has " + this.balance + " euros";
  }

  public void payEconomical() {
    if (this.balance >= 2.50) {
      this.balance -= 2.50;
    }
  }

  public void payGourmet() {
    if (this.balance >= 4.0) {
      this.balance -= 4.0;
    }
  }

  public void loadMoney(double amount) {
    if (this.balance + amount >= 150 && amount > 0) {
      this.balance = 150;
    } else if (amount > 0) {
      this.balance += amount;
    }
  }

}