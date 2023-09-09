package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ObjectFactory {
    public ObjectFactory(){
        System.out.println("Not only @Component creates an object but @Configuration also Creates an object");
    }

    @Bean
    public void testmethod(){
        System.out.println("Testing whether methods will be called or not");
    }
    // @Bean will call the methods present in class

    @Bean
    public static Car createOrangeCar()   // it works for even static methods also
    {
        System.out.println("testing configuration class methods (one parameter)!!!!!!");
        return new Car("ORANGE");
    }
    @Bean
    public Car createBlueCar()
    {
        System.out.println("testing configuration class methods (one parameter)!!!!!!");
        return new Car("Blue");
    }

    @Bean
    @Primary
    public Car createOrangeAndAudiCar()    // the "Car" is return type
    {
        System.out.println("testing configuration class methods(two parameters)!!!!!!");
        return new Car("ORANGE","Audi");
    }

}

// we know that @Component will create the object but using this we dont have any control on object creation
// to have some control on object creation we use 1.@configuration and 2.@bean the first will create the objects of that class and 1 is used for classes only
//  and where ever 2 is written that is also called it may be method or anything
// and we know that if we write 2 on a method it calls that method and in that method we can write the logic for object creation
// using component we cannot call parameterized constructors but using these 1 and 2 we can call parameterized constructors as in above example
// if we want to use more beans we need to declare one bean as primary and that will be executed first and then remaining ones
// EnableAutoConfiguration annotation automatically does configurations based on dependencies eg: we have a mysql database depen-
//   dencies and springboot wants to use a database and we will never write a code to use the mysql database and bcz of this annotation
//   it will automatically detects the type of database based on the dependencies and it will use mysql database this is the use of this annotation and this works
//   for anything not only database
// we should use @primary when we have methods different from the class