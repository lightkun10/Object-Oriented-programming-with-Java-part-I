public class Main {
    public static void main(String[] args) throws Exception {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        // Pekka buys gourmet lunch
        cardPekka.payGourmet();
        // Brian buys economical lunch
        cardBrian.payEconomical();
        // cards are printed
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        // Pekka loads 20 euros
        cardPekka.loadMoney(20);
        // Brian buys gourmet lunch
        cardBrian.payGourmet();
        // cards are printed
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        // Pekka buys economical lunch
        cardPekka.payEconomical();
        // Pekka buys economical lunch
        cardPekka.payEconomical();
        // Brian loads 50 euros
        cardBrian.loadMoney(50);
        // cards are printed
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}