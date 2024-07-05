public class Wolf extends Animal{
    private String color;
    private String favoriteFood;
    private int age;

    public Wolf(String color, String favoriteFood, int age) {
        this.color = color;
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

    public void print() {
        System.out.println("Is a wolf"+" with color "+color+" his favorite food "+favoriteFood+" and his age "+age);
    }
}
