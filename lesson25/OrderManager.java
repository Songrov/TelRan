package telran.homework.lesson25;
/*
1. Напишите метод, который принимает идентификатор покупателя (cnum)
и стоимость заказа (amt) и распечатывает все заказы этого покупателя
стоимостью большей чем amt. Для заказа распечатывайте его идентификатор,
 стоимость, идентификаторы покупателя и продавца и дату заказа.
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

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


    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getOrderDate() {
        return orderDate;
    }
}

public class OrderManager {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        manager.printCustomerOrdersAboveAmount("C123", 1000);
    }

    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();

        orders.add(new Order("001", 1500.00, "C123", "S123", "2021-01-15"));
        orders.add(new Order("002", 2000.00, "C123", "S124", "2021-02-15"));
        orders.add(new Order("003", 500.00, "C124", "S123", "2021-03-15"));
    }

    public void printCustomerOrdersAboveAmount(String cnum, double amt) {
        for (Order order : orders) {
            if (order.getCustomerId().equals(cnum) && order.getAmount() > amt) {
                System.out.println("Order ID: " + order.getOrderId() +
                        ", Amount: $" + order.getAmount() +
                        ", Customer ID: " + order.getCustomerId() +
                        ", Seller ID: " + order.getSellerId() +
                        ", Order Date: " + order.getOrderDate());
            }
        }
    }
}
