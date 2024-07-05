public class Anaconda extends Animal{
    private int length;
    private boolean liveinWater;
    private String name;

    public Anaconda(int length, boolean liveinWater, String name) {
        this.length = length;
        this.liveinWater = liveinWater;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("is a anaconda"+" with length "+length+" meters, live in water? "+liveinWater+" and his name "+name);
    }
}
