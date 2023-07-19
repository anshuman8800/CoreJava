public class Keyboard {
    private String currBuffer;
    private String type;
    private boolean isLight;

    public Keyboard(String currBuffer, String type, boolean isLight) {
        this.currBuffer = currBuffer;
        this.type = type;
        this.isLight = isLight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "currBuffer='" + currBuffer + '\'' +
                ", type='" + type + '\'' +
                ", isLight=" + isLight +
                '}';
    }
}
