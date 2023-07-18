public class Main {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount("Anny", "anny@314ecorp.com");
        person1.addMoney(1000);
        person1.showMoney();
        person1.retrieveMoney(10);
        person1.showMoney();
        System.out.println("Detials of person1 is " + person1.toString());
    }
}