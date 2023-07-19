public class Monitor {
    private String displaySize;
    private String displayQuality;
    private String maxBrightness;

    public Monitor(String displaySize, String displayQuality, String maxBrightness) {
        this.displaySize = displaySize;
        this.displayQuality = displayQuality;
        this.maxBrightness = maxBrightness;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "displaySize='" + displaySize + '\'' +
                ", displayQuality='" + displayQuality + '\'' +
                ", maxBrightness='" + maxBrightness + '\'' +
                '}';
    }
}
