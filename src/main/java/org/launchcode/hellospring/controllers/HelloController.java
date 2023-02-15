package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@GetMapping("hello")
@ResponseBody
public class HelloController {
    //Handle request at path /hello
    @GetMapping("/")
    public String hello() {
        return "Hello, Spring!";
    }
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //Handles request of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    //handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    //method to take info via form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me Bitch!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    //method to say hello in five different languages using dropdown
    @GetMapping("message")
    public String createMessage(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>"
    }

}
