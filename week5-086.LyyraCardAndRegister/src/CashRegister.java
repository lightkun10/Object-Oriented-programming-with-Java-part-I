
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000.0;
    }

    public double payEconomical(double cashGiven) {
        double economicalPrice = 2.50;

        if (cashGiven >= economicalPrice) {
            this.cashInRegister += economicalPrice;
            this.economicalSold++;
            cashGiven -= economicalPrice;
        } else {

        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        double economicalPrice = 2.50;
        // if the balance of the card is at least the price of the lunch:
        // the amount of sold lunches is incremented by one
        // the method returns true
        if (card.balance() >= economicalPrice) {
            this.economicalSold++;
            card.pay(economicalPrice);
            return true;
        }
        return false;
        // if not, the method returns false
    }

    public double payGourmet(double cashGiven) {
        double gourmetPrice = 4.00;
        if (cashGiven >= gourmetPrice) {
            this.cashInRegister += gourmetPrice;
            gourmetSold++;
            cashGiven -= gourmetPrice;
        } else {

        }
        return cashGiven;
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetPrice = 4.00;
        double cardBalance = card.balance();
        if (cardBalance >= gourmetPrice) {
            this.gourmetSold++;
            card.pay(gourmetPrice);
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            // double cardBalance = card.balance();
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold
                + " gourmet lunches sold: " + gourmetSold;
    }
}
