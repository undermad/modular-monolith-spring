package org.example.modularmonolith;


import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ModularityTest {

    ApplicationModules modules = ApplicationModules.of(ModularMonolithApplication.class);


    @Test
    void verifyModularity() {
        
        // -> Module model
        System.out.println(modules.toString());
        
        // -> Verify modules
        modules.verify();
    }
}
