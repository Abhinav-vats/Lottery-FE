package com.websocket.Lottery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getMessage(@RequestParam(name = "name", required = false) Optional<String> name){

        if (name.isPresent()){
            //
            List<Integer> li = Arrays.asList(1,2,3,4,5);
            li.set(0, 25);
            System.out.println(li);
            return "Hello " + name.get();
        }else{
            return "Hello";
        }
    }
}
