public class Dog extends Animal {
    public Dog(String name, Taxonomy taxonomy) {
        super(name, taxonomy);
    }

    @Override
    public String getSound() {
        return "barks";
    }

    @Override
    public String toString() {
        return String.format("A Dog called %s.", getName());
    }
}
