import model.Order;
import service.OrderProcessor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("1234","John");

        List<Order> orderList = new ArrayList<>();

        orderList.add(order);
        orderList.add(new Order("1233","Molly"));
        orderList.add(new Order("1235","Ali"));
        orderList.add(new Order("1236","Vali"));
        orderList.add(new Order("1237","Alibek"));
        orderList.add(new Order("1238","Alijon"));
        orderList.add(new Order("1239","Alisher"));

        OrderProcessor orderProcessor = new OrderProcessor(10);

        orderProcessor.processOrders(orderList);



    }
}