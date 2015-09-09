package demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.entity.*;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@EntityScan(basePackageClasses = role_permissions.class)
public class DemoApplication {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/hi")
    public String hi() {
        return "hi";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String biggirl(@PathVariable int id) {
        return "bigbiggril" + String.valueOf(id);
    }
}
