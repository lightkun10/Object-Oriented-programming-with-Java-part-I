
public class Main {

    public static void main(String[] args) {
        CashRegister cafeRex = new CashRegister();
        System.out.println(cafeRex);

        LyyraCard panduCard = new LyyraCard(2);

        System.out.println("the card balance " + panduCard.balance() + " euros");

        boolean succeeded = cafeRex.payGourmet(panduCard);
        System.out.println("payment success: " + succeeded);

        cafeRex.loadMoneyToCard(panduCard, 100);

        succeeded = cafeRex.payGourmet(panduCard);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + panduCard.balance() + " euros");

        System.out.println(cafeRex);
    }
}
