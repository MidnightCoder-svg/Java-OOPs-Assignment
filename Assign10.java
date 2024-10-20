
    import java.util.ArrayList;
    import java.util.List;
    interface PaymentStrategy {
    void pay(int amount);
    }
    class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    public CreditCardPayment(String cardNumber, String
    cardHolderName) {
    this.cardNumber = cardNumber;
    this.cardHolderName = cardHolderName;
    }
    public void pay(int amount) {
    System.out.println("Paid " + amount + " using Credit Card.");
    }
    }
    class PayPalPayment implements PaymentStrategy {
    private String email;
    public PayPalPayment(String email) {
    this.email = email;
    }
    public void pay(int amount) {
    System.out.println("Paid " + amount + " using PayPal.");
    }
    }
    class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;
    public BitcoinPayment(String walletAddress) {
    this.walletAddress = walletAddress;
    }
    public void pay(int amount) {
    System.out.println("Paid " + amount + " using Bitcoin.");
    }
    }
    class ShoppingCart {
    private List<String> items;
    private PaymentStrategy paymentStrategy;
    public ShoppingCart() {
    items = new ArrayList<>();
    }
    public void addItem(String item) {
    items.add(item);
    }
    public void setPaymentStrategy(PaymentStrategy
    paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
    }
    public void checkout() {
    int totalAmount = calculateTotal();
    if (paymentStrategy == null) {
    System.out.println("Payment method not set.");
    return;
    }
    paymentStrategy.pay(totalAmount);
    }
    private int calculateTotal() {
    return items.size() * 100;
    }
    }
    public class Assign10 {
    public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    cart.addItem("Item 1");
    cart.addItem("Item 2");
    cart.addItem("Item 3");
    cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Ankit"));
    cart.checkout();
    System.out.println();
    cart.setPaymentStrategy(new
    PayPalPayment("ankit15@example.com"));
    cart.checkout();
    System.out.println();
    cart.setPaymentStrategy(new
    BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
    cart.checkout();
    }
    }
