import java.util.List;
import java.util.ArrayList;

public abstract class Animal {
    private static final String BIO_NAME = "Animalia"; // Kingdom is constant
    protected String name;  //  Add name field for better identification
    protected Taxonomy taxonomy;  // Use a Taxonomy class instead of multiple abstract methods

    public Animal(String name, Taxonomy taxonomy) {
        this.name = name;
        this.taxonomy = taxonomy;
    }

    public String getKingdom() {
        return BIO_NAME;
    }

    public String getName() {
        return name;
    }

    public Taxonomy getTaxonomy() {
        return taxonomy;
    }

    //  Keep `getSound()` as an abstract method (since different animals have different sounds)
    public abstract String getSound();
}
