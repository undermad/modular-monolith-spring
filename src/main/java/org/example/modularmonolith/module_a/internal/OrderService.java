package org.example.modularmonolith.module_a.internal;

import org.example.modularmonolith.module_a.Order;
import org.example.modularmonolith.module_a.OrderCompletedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    
    private final ApplicationEventPublisher eventPublisher;

    public OrderService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public Order complete(Order order) {
        eventPublisher.publishEvent(new OrderCompletedEvent(order));
        return order;
    }
}
