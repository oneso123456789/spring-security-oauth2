package io.security.cors2;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
@Slf4j
public class Cors2Controller {

    @GetMapping("/users")
    public User users(){
        log.info("msg");
        return new User("user", 20);
    }
}
