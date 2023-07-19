public class GamePlayer {
    private String name;
    private double health;

    public GamePlayer(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public void addHealth(double additionalHealth) {
        this.health += additionalHealth;
    }

    public void damageHealth(double damageHealth) {
        this.health -= damageHealth;
    }

    @Override
    public String toString() {
        return "GamePlayer{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
