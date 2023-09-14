package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {
    @GetMapping("api/v1/mani/123/i")
    public String api1(){
        return "Manikanta";
    }
    // to make this as an API we need to use the two annos @RestController and @GetMapping(enter the url (we can use anythig))
// get is type of api
// and to check this is working or not use(http://localhost:8080/api/v1/mani/123/i) paste in google. (8080: bcz it is working on your local host on port 8080)

    @Autowired
    @Qualifier("orangecar") // we are using specified bean
    Car carobj;
    // @Component will create an object and it will be kept by springboot and when we write @autowired then it will give the object present with it to the reference(here carobj) where @autowired is written
    // here there is one case when we write @primary for a bean then then the springboot will store the object of that method
    // to check paste the below path in google
    @GetMapping("api/v2/manikanta/api/1")
    public Car getcar(){
        return carobj;
    }   // the object referenced by carobj will be returned and carobj will get the object from above step
    @PutMapping("api/v1/change/color") // for this you need to use postman
    public String setColor()
    {
        carobj.setColour("green");
        return "colour changed";
    }
}



