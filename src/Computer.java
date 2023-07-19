public class Computer {
    private int price;
    Monitor monitor;
    CPU cpu;
    Keyboard keyboard;

    public Computer(int price) {
        this.price = price;
        this.monitor = new Monitor("16inch", "1080", "2000nits");
        this.cpu = new CPU("2.2Ghz", "16", "500GB");
        this.keyboard = new Keyboard("ABCD", "16Inch", true);
    }

    @Override
    public String toString() {
        return "price : " + price + monitor.toString() + cpu.toString() + keyboard.toString();
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer(2000);
        System.out.println(myComputer.toString());
    }
}
