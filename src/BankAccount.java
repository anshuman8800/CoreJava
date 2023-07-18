public class BankAccount {
    private String holderName;
    private String emailId;
    private double currentBalance = 0;

    @Override
    public String toString() {
        return "BankAccount{" +
                "holderName='" + holderName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }

    BankAccount(String holderName, String emailId) {
        this.holderName = holderName;
        this.emailId = emailId;
    }

    public void addMoney(double money) {
        if(money < 0) {
            System.out.println("Added money can't be negative");
            return;
        }
        this.currentBalance += money;
        System.out.println("Money added Successfully");
    }

    public boolean retrieveMoney(double money) {
        if(this.currentBalance < money) {
            System.out.println("Insufficient Balance");
            return false;
        }
        this.currentBalance -= money;
        System.out.println("Money deducted Successfully");
        return true;
    }

    public void showMoney() {
        System.out.println(this.holderName + " has current Balance : " + this.currentBalance);
    }
}
