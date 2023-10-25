package model;

public class Order {
    private String orderId;
    private String costumerName;

    public Order(String orderId, String costumerName) {
        this.orderId = orderId;
        this.costumerName = costumerName;
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }
}
