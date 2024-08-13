package xyz.rajlabs.eureka_test_client_microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String welcome()
    {
        return "Hello this is working test client microservice ";
    }
}
