package org.poem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;

/**
 * @author poem
 */
@SpringBootApplication
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
public class SwggerBootsrapUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwggerBootsrapUiApplication.class, args);
    }
}
