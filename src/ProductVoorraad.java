import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class ProductVoorraad <T extends Product> {
    private final List<T> voorraad = new ArrayList<>();

    public T getProduct(UUID id){
        return voorraad.stream().filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product niet gevonden"));
    }

    public List<T> returnAll(){
        return voorraad;
    }

    public void toevoegen(T product){
        voorraad.add(product);
    }
}
