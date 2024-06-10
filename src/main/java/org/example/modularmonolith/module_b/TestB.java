package org.example.modularmonolith.module_b;

import org.example.modularmonolith.module_a.OrderCompletedEvent;
import org.example.modularmonolith.module_a.TestA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class TestB {
    

    private final Logger logger = LoggerFactory.getLogger(TestB.class);
    
    private final TestA testA;

    public TestB(TestA testA) {
        this.testA = testA;
    }

    @EventListener
    public void onReady(ApplicationReadyEvent event){
        logger.info("Application is ready - ordering <-- logger");
        testA.processOrder();
    }
    
    @EventListener
    public void orderCompleted(OrderCompletedEvent event){
        logger.info(event.getOrder().getName());
    }
    
    

}
