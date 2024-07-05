public class Main {
    public static void main(String[] args) {

        Animal wolf = createAnimal("wolf");

        Animal pigeon = createAnimal("pigeon");

        Animal anaconda = createAnimal("anaconda");

        Animal[] animals = {wolf, pigeon, anaconda};
        for (int i = 0; i < animals.length; i++) {
            animals[i].print();
        }


    }

    public static Animal createAnimal(String className) {
        switch (className){
            case "wolf":
                return new Wolf("grey", "meat", 7);
            case "pigeon":
                return new Pigeon(true, "city", true);
            case "anaconda":
                return new Anaconda( 5, true, "anaconda");
            default:
                return null;
        }
    }
}