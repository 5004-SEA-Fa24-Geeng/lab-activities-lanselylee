import java.util.List;
import java.util.ArrayList;

public interface Companion {
    void train(Trick trick);
    List<Trick> getTricks();
    String getName();
}
