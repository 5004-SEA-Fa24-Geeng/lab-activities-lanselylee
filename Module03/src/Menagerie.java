import java.util.List;
import java.util.ArrayList;

public class Menagerie {
    private List<Animal> animals;  // Encapsulated list of animals

    public Menagerie() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animals);  // Return a copy for safety
    }

    public int getCount() {
        return animals.size();
    }

    // Adds test animals to the menagerie
    private static void addTestSet(Menagerie menagerie) {
        Taxonomy dogTaxonomy = new Taxonomy("Canis lupus", "Chordata", "Mammalia", "Carnivora", "Canidae", "Canis", "Canis lupus", "Animalia");
        Taxonomy catTaxonomy = new Taxonomy("Felis catus", "Chordata", "Mammalia", "Carnivora", "Felidae", "Felis", "Felis catus", "Animalia");
        Taxonomy foxTaxonomy = new Taxonomy("Vulpes vulpes", "Chordata", "Mammalia", "Carnivora", "Canidae", "Vulpes", "Vulpes vulpes", "Animalia");

        menagerie.addAnimal(new Dog("Fido", dogTaxonomy));
        menagerie.addAnimal(new Dog("Roy", dogTaxonomy));
        menagerie.addAnimal(new Cat("Cattivo", catTaxonomy));
        menagerie.addAnimal(new Fox("Robin", foxTaxonomy));
        menagerie.addAnimal(new Cat("Gus", catTaxonomy));
    }

    public static void main(String[] args) {
        Menagerie menagerie = new Menagerie();
        addTestSet(menagerie);

        System.out.println("Animals in the Menagerie:");
        for (Animal animal : menagerie.getAnimals()) {
            System.out.println(animal);
        }

        System.out.printf("Total animals in the menagerie: %d\n", menagerie.getCount());
    }
}
