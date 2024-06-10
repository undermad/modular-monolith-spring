package org.example.modularmonolith.module_a;

import lombok.Getter;
import org.example.modularmonolith.module_a.internal.OrderService;
import org.springframework.stereotype.Component;

@Getter
@Component
public class TestA 
{
    
    private OrderService orderService;

    public TestA(OrderService orderService) {
        this.orderService = orderService;
    }

    public void processOrder(){
        orderService.complete(new Order("Order by EventPublisher"));
    }

    
}
