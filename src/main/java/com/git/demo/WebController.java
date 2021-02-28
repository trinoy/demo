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

    @GetMapping("/ping6")
    public String ping6() {
        return "pong6";
    }

    @GetMapping("/ping7")
    public String ping7() {
        return "pong7";
    }


    @GetMapping("/ping8")
    public String ping8() {
        return "pong8";
    }

    @GetMapping("/ping9")
    public String ping9() {
        return "pong9";
    }

}
