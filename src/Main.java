public class Main {
    public static void main(String[] args) {
        GamePlayer anny = new GamePlayer("anny", 100);
        System.out.println("annyCurrent health " + anny.getHealth());
        anny.damageHealth(15);
        System.out.println("annyCurrent health " + anny.getHealth());
        anny.damageHealth(50);
        System.out.println("annyCurrent health " + anny.getHealth());
        anny.addHealth(8);
        System.out.println("annyCurrent health " + anny.getHealth());
        System.out.println("Player Info " + anny.toString());
    }
}

/*
OUTPUT
annyCurrent health 100.0
annyCurrent health 85.0
annyCurrent health 35.0
annyCurrent health 43.0
Player Info GamePlayer{name='anny', health=43.0}
* */