package Lab4;

public class Dog {
    private String name;
    private String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setBreed(String breed) {

        this.breed = breed;
    }

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;}
    public static void main(String[] args) {
        Dog dog1 = new Dog("Richi", "Ciobanesc");
        Dog dog2 = new Dog("Pufi", "Labrador");
        System.out.println("Numele cainelui 1: " + dog1.getName());
        System.out.println("Numele cainelui 2: " + dog2.getName());
        System.out.println("Rasa cainelui 1: " + dog1.getBreed());
        System.out.println("Rasa cainelui 2: " + dog2.getBreed());
        dog1.setName("Max");
        dog1.setBreed("Bulldog");
        dog2.setName("Lola");
        dog2.setBreed("German"); // Aici am corectat setarea rasei pentru dog2
        System.out.println("Numele modificat cainelui 1: " + dog1.getName());
        System.out.println("Numele modificat cainelui 2: " + dog2.getName());
        System.out.println("Rasa modificat cainelui 1: " + dog1.getBreed());
        System.out.println("Rasa modificat cainelui 2: " + dog2.getBreed());
    }
}
