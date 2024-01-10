package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.modal.IPhone;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/IPhone")
public class IPhoneAPIService
{

    IPhone iPhone;


    @GetMapping("{IPhoneModal}")
    public IPhone getiIPhoneDetails(String IPhoneModal)
    {
        return iPhone;
//                ("IPhone15","Silver",
//                "256Gb","$1299");

    }

    @PostMapping
    public String CreateIPhoneDetails(@RequestBody IPhone iPhone)
    {
        this.iPhone = iPhone;
        return "IPhone created sucessfully" ;
    }

    @PutMapping
    public String UpdateIPhoneDetails(@RequestBody IPhone iPhone)
    {
        this.iPhone = iPhone;
        return "IPhone Updated Sucessfully";
    }

    @DeleteMapping
    public String DeletedIPhoneDetails(@RequestBody IPhone iPhone)
    {
        this.iPhone = iPhone;
        return "IPhone Deleted Sucessfully";
    }

}
