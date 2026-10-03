package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hi";
    }

    @GetMapping("/status")
        public String Status(){
            return "Spring is working on Apache Tomcat server port 8080";
        }


    @GetMapping("/goodbye")
    public String Bye(){
        return "Good bye from spring boot";
    }


}
