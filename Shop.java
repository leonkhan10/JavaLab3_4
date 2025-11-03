import java.util.ArrayList;
import java.util.List;

public class Shop
{
private List<String> inventory;

    public Shop() {
        this.inventory = new ArrayList<>();
    }

    public void addProduct(String product) {
        this.inventory.add(product);
    }

    public String describeStory() {
        return "Когда-то у меня был магазин разнокалиберных товаров, в котором я вел большую торговлю: "
                + String.join(", ", inventory) + ".";
    }
}