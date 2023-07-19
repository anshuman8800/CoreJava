public class CPU {
    private String processor;
    private String ram;
    private String rom;

    public CPU(String processor, String ram, String rom) {
        this.processor = processor;
        this.ram = ram;
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                '}';
    }
}
