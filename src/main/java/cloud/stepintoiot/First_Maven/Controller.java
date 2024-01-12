package cloud.stepintoiot.First_Maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String sayHi(){
        return "Hello From NK";
    }
}