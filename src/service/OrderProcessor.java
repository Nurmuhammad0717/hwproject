package service;

import model.Order;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderProcessor {
    ExecutorService executor;
    int threadPoolSize;

    public OrderProcessor( int threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
        executor = Executors.newFixedThreadPool(threadPoolSize);
    }

    public void processOrders(List<Order> orders){
        for (Order order : orders) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    processOrder(order);
                }
            });
        }
        executor.shutdown();
    }

    private void processOrder(Order order) {
        System.out.println("Processing order"+order.getOrderId()+" for Costumer "+
                order.getCostumerName()+"|"+Thread.currentThread().getName());
    }




}
