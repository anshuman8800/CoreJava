public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }

    public String startEngine() {
        return getClass().getName() + " -> startEngine()";
    }

    public String accelerate() {
        return getClass().getName() + " -> accelerate()";
    }

    public String brake() {
        return getClass().getName() + " -> brake()";
    }

}