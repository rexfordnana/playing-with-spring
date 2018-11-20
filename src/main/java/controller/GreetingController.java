package controller;

import dbo.Greeting;
import dbo.Rexfordnana;
import org.springframework.web.bind.annotation.*;
import services.RexfordNanaService;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by rexfordnana on 9/1/18.
 */

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    RexfordNanaService rNService = new RexfordNanaService();
    Rexfordnana rexfordnana = new Rexfordnana();

    @RequestMapping("/greeting")
    public Greeting greetings(@RequestParam(value="name", defaultValue = "Dummy") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/sayHi")
    public Rexfordnana sayHi(){
        rexfordnana = rNService.sayHi();
        return rexfordnana;
    }
}
