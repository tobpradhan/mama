package za.co.data.config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "za.co.data")
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}