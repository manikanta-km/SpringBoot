package com.example.UserManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UMSController {
    @Autowired
    List<UMS> userMS;

    // To Create A User
    @PostMapping("User")
    public String addUser(@RequestBody UMS user)
    {
        userMS.add(user);
        return "user added";
    }

    // To Get All Users Present
    @GetMapping("Users")
    public List<UMS> getAllUsers()
    {
        return userMS;
    }

    // To Get User By UserId
    @GetMapping("getUser/{userid}")
    public List<UMS> getUserById(@PathVariable Integer userid)
    {
        //return todoList.stream().filter(todo -> !todo.isTodoStatus()).collect(Collectors.toList());

        List<UMS> userbyid = new ArrayList<>();
        for(UMS user : userMS)
        {
            if(user.getUserId().equals(userid))
            {
                userbyid.add(user);
            }
        }

        return userbyid;

    }

    // To Update User Info
    @PutMapping("user/id/{userid}/name/address")
    public String setUserInfoById(@PathVariable Integer userid, @RequestParam String name, @RequestParam String address)
    {
        for(UMS user : userMS)
        {
            if(user.getUserId().equals(userid))
            {
                user.setName(name);
                user.setAddress(address);
                return "Name: "   +  "updated to " + name + " " + "Address: " +  "updated to " + address;
            }
        }

        return "Invalid id";
    }

    // To Delete A User By UserId
    @DeleteMapping("user/id/{userid}")
    public String removeUserById(@PathVariable Integer userid)
    {
        for(UMS user : userMS)
        {
            if(user.getUserId().equals(userid))
            {
               userMS.remove(user);
               return "User with the id " + userid + " removed";
            }
        }

        return "Invalid id";
    }

    // To Create Users In Bulk

    @PostMapping("Users")
    public String addUsers(@RequestBody List<UMS> newusers)
    {
       /* for(UMS user: newusers)
        {
            userMS.add(user);
        }*/

        userMS.addAll(newusers);

        return newusers.size() + " New Users Were Added";
    }




}
