public class Fox extends Animal {
    public Fox(String name, Taxonomy taxonomy) {
        super(name, taxonomy);
    }

    @Override
    public String getSound() {
        return "What does the fox say?";
    }

    @Override
    public String toString() {
        return String.format("A Fox called %s.", getName());
    }
}
