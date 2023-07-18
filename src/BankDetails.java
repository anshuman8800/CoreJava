public class BankDetails {
    public static void main(String[] args) {
        Bank sbi = new Bank();
        System.out.println(sbi.getName()); // => Nothing
        sbi.setName("SBI");
        System.out.println(sbi.getName()); // => SBI
        System.out.println(Bank.getName());// => SBI

        Bank hdfc = new Bank();
        System.out.println(hdfc.getName()); // => SBI , since static variable is same for all instance of class
        hdfc.setName("hdfc");  // It is not a good practice to set static variable using objects
        Bank.setName("HDFC");  // Use class.methodName to set static variable
        System.out.println(Bank.getName());

    }
}
