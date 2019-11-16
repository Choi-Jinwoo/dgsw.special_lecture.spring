package kr.hs.dgsw.lecture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @GetMapping("/")
    public String index() {
        return "Hello Spring Boot";
    }
}
