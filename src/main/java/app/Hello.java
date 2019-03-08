package app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello { //lesson#05

    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello Spring";
    }

}
