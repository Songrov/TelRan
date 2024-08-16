package telran.homework.lesson25;
/*
1. Напишите метод, который принимает идентификатор покупателя (cnum)
и стоимость заказа (amt) и распечатывает все заказы этого покупателя
стоимостью большей чем amt. Для заказа распечатывайте его идентификатор,
 стоимость, идентификаторы покупателя и продавца и дату заказа.
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
class Order {
    private String orderId;
    private double amount;
    private String customerId;
    private String sellerId;
    private String orderDate;
}

public class OrderManager {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        manager.printCustomerOrdersAboveAmount("C123", 1000); // Используем метод для печати заказов покупателя C123 стоимостью выше 1000
    }

    private List<Order> orders; // Список заказов БД

    public OrderManager() {
        this.orders = new ArrayList<>();
        // Инициализация с примерными данными
        orders.add(new Order("001", 1500.00, "C123", "S123", "2024-01-15"));
        orders.add(new Order("002", 2000.00, "C123", "S124", "2024-02-15"));
        orders.add(new Order("003", 500.00, "C124", "S123", "2024-03-15"));
    }

    public void printCustomerOrdersAboveAmount(String cnum, double amt) {
        for (Order order : orders) {
            if (order.getCustomerId().equals(cnum) && order.getAmount() > amt) {
                System.out.println("Order ID: " + order.getOrderId() + ", Amount: $" + order.getAmount() +
                        ", Customer ID: " + order.getCustomerId() + ", Seller ID: " + order.getSellerId()
                        + ", Order Date: " + order.getOrderDate());
            }
        }
    }
}
