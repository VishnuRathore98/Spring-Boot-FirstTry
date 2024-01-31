package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value = "page") int pageNo, @RequestParam(value = "limit") int limitNo)
    //Query parameters
    {
        return "This is a GET request for pageNo: "+pageNo+" and limit is: "+limitNo;
    }

    @GetMapping(path = "/{userID}") //Path parameter
    public String getUser(@PathVariable String userID){
        return "This is a GET request for userID: "+userID;
    }

    @PostMapping
    public String postUser(){
        return "This is a POST request.";
    }

    @PutMapping
    public String putUser(){
        return "This is a PUT request.";
    }

    @DeleteMapping
    public String deleteUser(){
        return "This is a DELETE request.";
    }
}
