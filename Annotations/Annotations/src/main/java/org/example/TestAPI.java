package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestAPI {

    @Autowired
    List<Integer> integerList;
    @GetMapping("v1/twice/{x}")
    public Integer gettwice(@PathVariable Integer x){
        return 2*x;
    }
    // when we pass something into method it is called arguments, in api it is called params
    // the above code is an example to pass params in api, we have other ways also, this way is using path
    // to check paste this in google http://localhost:8080/v1/twice/5
    @GetMapping("v1/str/{x}")
    public String getstr(@PathVariable String x){
        return x;
    }
    // in above we send string
    // to check paste this in google http://localhost:8080/v1/str/abc
    // but this way has a disadvantage bcz for others they dont know what type of value to pass in x bcz they dont see the whole code

    @GetMapping("api/sum/{num1}/mainak/{num2}")
    public Integer sum(@PathVariable Integer num1,@PathVariable Integer num2)
    {
        return num1 + num2;
    }
    // above is for to pass two params and here also the same disadvantage as above

    @PostMapping("number/{x}")
    public String addNumber(@PathVariable Integer x)
    {
        integerList.add(x);
        return x + " added";
    }


    @GetMapping("numbers")
    public List<Integer> getIntegerList()
    {
        return integerList;
    }

}



