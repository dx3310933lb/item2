package com.dx.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test1(){
        return "hello world springboot!";
    }

    @PostMapping("/posthello")
    public String test2(){
        return "post world springboot!";
    }

    @DeleteMapping("/deletehello")
    public String test3(){
        return "delete world springboot!";
    }

    @GetMapping("/hello/{userId}/{passwd}")
    public String test4(@PathVariable String userId, @PathVariable String passwd){
        return "hello param get!"+ userId + " : " + passwd;
    }

    @DeleteMapping("/hello/{userId}/{passwd}")
    public String test5(@PathVariable String userId, @PathVariable String passwd){
        return "hello param get!"+ userId + " : " + passwd;
    }

    @PutMapping ("/hello/{userId}/{passwd}")
    public String test6(@PathVariable String userId, @PathVariable String passwd){
        return "hello param get!"+ userId + " : " + passwd;
    }
}
