package daggerok;

import com.vaadin.spring.annotation.EnableVaadin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableVaadin
@SpringBootApplication
public class SpeingBootVaadinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeingBootVaadinApplication.class, args);
    }
}
