import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;



public class ProductRange {
    @Getter
    private static List<Product> range =  new ArrayList<>();
    static {
        range.add(new Product(1001, "Apple", 3.01f));
        range.add(new Product(1002, "Orange", 2.51f));
        range.add(new Product(1003, "Cherry", 6.60f));
        range.add(new Product(1004, "Pineapple", 7.90f));
        range.add(new Product(1005, "Cucumber", 2.23f));
        range.add(new Product(1006, "Tomatoes", 3.17f));
    }
}
