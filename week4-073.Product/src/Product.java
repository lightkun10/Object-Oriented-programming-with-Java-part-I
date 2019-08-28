public class Product {
  private String name;
  private double price;
  private int amount;

  // CONSTRUCTOR
  public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
    this.name = nameAtStart;
    this.price = priceAtStart;
    this.amount = amountAtStart;
  }

  // METHOD
  public void printProduct() {
    System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
  }
}