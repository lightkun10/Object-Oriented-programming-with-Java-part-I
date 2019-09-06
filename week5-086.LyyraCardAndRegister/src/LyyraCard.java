
public class LyyraCard {

    // OBJECT VARIABLES .. FIELDS
    private double balance;

    // OBJECT CONSTRUCTOR
    public LyyraCard(double balance) {
        this.balance = balance;
    }

    // OBJECT METHOD
    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
