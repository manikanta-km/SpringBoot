package com.example.Main;

import org.springframework.web.bind.annotation.*;

@RestController
public class APITest {
    @GetMapping("name")
    public String getName()
    {
        return "Mani";
    }

    //pass arguments to the underlying method of an API
    // we can pass arguments to API in three ways they are 1.Path Variables 2.Request Params 3.Request Body
    // we can pass any no of path variables and request params, and we can pass only one request body
    // and in body we can pass complex data also thats why to pass a complex obj we use body
    // below are the three ways


    //path variables:
    // using api path we send the parameters in the flower braces we pass the variable
    // eg : product/num1/1/num2/2

    @GetMapping("product/num1/{num1}/num2/{num2}")
    public Integer getProduct(@PathVariable Integer num1, @PathVariable Integer num2)
    {
        return num1 * num2;
    }


    // passing parameters using the hashmap (request params) of the http request
    // in this also we pass variables in the path but we keep a question mark (?) after path and send it to add more
    // we use & after every variable
    // eg : 127.0.0.1:8080/append/test?name=mani
    // eg2 : 127.0.0.1:8080/append/name/age?name=mani&age=23

    @GetMapping("append/test")
    public String appendTest(@RequestParam String name)
    {
        return name + " test";
    }

    @GetMapping("append/name/age")
    public String appendTest(@RequestParam String name, @RequestParam String age)
    {
        return name + " " + age;
    }

    //combination of path variable and request param

    @GetMapping("append/first/{firstname}/lastName")
    public String appendNames(@PathVariable String firstname, @RequestParam String lastName)
    {
        return firstname + " " + lastName;
    }

    // request body
    @GetMapping("age")
    public Integer showAge(@RequestBody Integer age)
    {
        return age;
    }

    @GetMapping("car")
    public Car showCar(@RequestBody Car obj)
    {
        return obj;
    }

    // below is an example how we pass complex data to api using request body to check paste in postman with brackets
    //{
    //"name" : "mani",
    // "color" : "red",
    // "number" : "1234"
    //}
}
