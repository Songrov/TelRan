package telran.homework.lesson27;
/*
Добавьте метод sortBy c чтобы можно было возвращать отсортированный список продуктов

GET http://localhost:8080/products/sortBy?by=price&how=desc
by - поле - price, name, id
how - desc, asc
 */

import java.util.Comparator;

@GetMapping("/products/sortBy")
public Iterable<Product> sortBy(
        @RequestParam (name = "by", defaultValue = "id") String by,
        @RequestParam (name = "how", defaultValue = "asc") String how
) {
    Comparator<Product> comparator = null;
    if(by.equals("id") || by.equals("name") || by.equals("price")) {
        switch (by) {
            case "id":
                comparator = Comparator.comparing(Product::getId);
                break;
            case "name":
                comparator = Comparator.comparing(Product::getName);
                break;
            case "price":
                comparator = Comparator.comparing(Product::getPrice);
                break;
        }
    } else {
        throw new IllegalArgumentException("No " + by + " field in Product");
    }
    if (how.equals("desc")) {
        comparator = comparator.reversed();
    } else if (how.equals("asc")) {
        //
    } else {
        throw new IllegalArgumentException("No " + how + " in sort");
    }
    return products.stream()
            .sorted(comparator)
            .toList();
}
