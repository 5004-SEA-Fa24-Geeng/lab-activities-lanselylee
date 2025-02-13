public class Trick {
    private String name;
    private String description;

    public Trick(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Override toString() to provide meaningful output
    @Override
    public String toString() {
        return "Trick{" + name + "}";
    }
}
