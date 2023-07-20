public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
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
