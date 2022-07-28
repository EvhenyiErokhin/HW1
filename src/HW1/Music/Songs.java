package HW1.Music;

public class Songs {
    public static void main(String[] args) {
        Classic classic = new Classic();
        Jazz jazz = new Jazz();
        Pop pop = new Pop();
        RNB rnb = new RNB();
        Rock rock = new Rock();
        classic.run();
        jazz.run();
        pop.run();
        rnb.run();
        rock.run();
    }
}