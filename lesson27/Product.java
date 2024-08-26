package telran.homework.lesson27;
/*
Добавьте метод sortBy c чтобы можно было возвращать отсортированный список продуктов

GET http://localhost:8080/products/sortBy?by=price&how=desc
by - поле - price, name, id
how - desc, asc
 */
public class Product {
    private Long id;
    private String name;
    private double price;

    // Конструкторы, геттеры и сеттеры

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
