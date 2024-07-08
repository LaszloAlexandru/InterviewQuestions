package org.real.project.example.services;

import org.real.project.example.entities.OrderEntity;
import org.real.project.example.models.Order;

import java.util.List;

public interface OrderService {
    //Create
    Order createOrder(Order order);

    //READ
    Order getOrderById(Integer id);

    List<OrderEntity> getAllOrders();

    Order getOrderByDateOfSubmission(String dateOfSubmission);

    //UPDATE
    Order updateOrder(Integer id, Order order);

    //DELETE
    void deleteOrderById(Integer id);

    void deleteAllOrders();
}
