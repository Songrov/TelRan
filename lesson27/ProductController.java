package telran.homework.lesson27;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    private List<Product> products;

    public ProductController() {
        // Инициализация примерных данных
        products = new ArrayList<>();
        products.add(new Product(1L, "Apple", 1.5));
        products.add(new Product(2L, "Banana", 0.9));
        products.add(new Product(3L, "Carrot", 2.3));
    }

    @GetMapping("/products/sortBy")
    public List<Product> sortBy(
            @RequestParam String by,
            @RequestParam String how
    ) {
        Comparator<Product> comparator;

        // Определяем компаратор на основе поля
        switch (by.toLowerCase()) {
            case "price":
                comparator = Comparator.comparing(Product::getPrice);
                break;
            case "name":
                comparator = Comparator.comparing(Product::getName);
                break;
            case "id":
                comparator = Comparator.comparing(Product::getId);
                break;
            default:
                throw new IllegalArgumentException("Invalid sort field: " + by);
        }

        // Если требуется обратный порядок, применяем reverseOrder
        if ("desc".equalsIgnoreCase(how)) {
            comparator = comparator.reversed();
        }

        // Сортируем и возвращаем отсортированный список
        return products.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
