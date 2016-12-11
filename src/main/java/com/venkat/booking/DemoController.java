package com.venkat.booking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Srijan on 10-12-2016.
 */

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!!!";
    }
}
