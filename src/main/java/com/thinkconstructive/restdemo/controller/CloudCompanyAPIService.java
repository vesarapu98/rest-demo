package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.modal.CloudCompany;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudCompany")
public class CloudCompanyAPIService
{

    CloudCompany cloudCompany;

    @GetMapping("{CompanyId}")
    public CloudCompany getCloudCompany(String CompanyId)
    {
        return cloudCompany;
//                ("A1", "Apple1",
//                "Address One","XXXXXXXX");
    }
    @PostMapping
    public String createCloudCompanyDetails(@RequestBody CloudCompany cloudCompany)
    {
        this.cloudCompany = cloudCompany;
        return "Cloud Company Created Sucessfully";
    }


    @PutMapping
    public String updateCloudCompanyDetails(@RequestBody CloudCompany cloudCompany)
    {
        this.cloudCompany = cloudCompany;
        return "Cloud Company Updated Sucessfully";
    }

    @DeleteMapping("{CompanyId}")
    public String deleteCloudCompanyDetails(String CompanyId)
    {
        this.cloudCompany = null;
        return "Cloud Company Deleted Sucessfully";
    }
}
