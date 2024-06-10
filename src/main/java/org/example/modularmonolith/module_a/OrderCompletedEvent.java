package org.example.modularmonolith.module_a;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderCompletedEvent {
    
    private Order order;
    
    
}
