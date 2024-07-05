public class Pigeon extends Animal{
    private boolean flyable;
    private String liveIn;
    private boolean isVegan;

    public Pigeon(boolean flyable, String liveIn, boolean isVegan) {
        this.flyable = flyable;
        this.liveIn = liveIn;
        this.isVegan = isVegan;
    }

    @Override
    public void print() {
        System.out.println("Is a pigeon live in "+liveIn+", and is vegan? "+isVegan+" and flyable? "+flyable);
    }
}
