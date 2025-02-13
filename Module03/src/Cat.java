public class Cat extends Animal {
    public Cat(String name, Taxonomy taxonomy) {
        super(name, taxonomy);
    }

    @Override
    public String getSound() {
        return "meow";
    }

    @Override
    public String toString() {
        return String.format("A Cat called %s.", getName());
    }
}
