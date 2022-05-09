public class JavaApp {

    public static void main(String[] args) {
        Animal pet = new Animal("Chinchilla");
        System.out.println(pet.species);
        pet.feed();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();
        pet.takeForAWalk();

    }
}
