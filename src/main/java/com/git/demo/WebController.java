package com.git.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/ping4")
    public String ping4() {
        return "pong4";
    }

    @GetMapping("/ping1")
    public String ping1() {
        return "pong1";
    }

    @GetMapping("/ping2")
    public String ping2() {
        return "pong2";
    }

    @GetMapping("/ping5")
    public String ping5() {
        return "pong5";
    }

    @GetMapping("/ping6")
    public String ping6() {
        return "pong6";
    }

}
