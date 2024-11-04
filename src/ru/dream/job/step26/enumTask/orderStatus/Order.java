package ru.dream.job.step26.enumTask.orderStatus;

public class Order {

    private OrderStatus status;
    private final int orderId;

    public Order(int orderId) {
        this.status = OrderStatus.НОВЫЙ;
        this.orderId = orderId;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
        System.out.println("Статус заказа №" + orderId + " изменен на: " + this.status);
    }

    public OrderStatus getStatus() {
        return status;
    }

    public int getOrderId() {
        return orderId;
    }
}
