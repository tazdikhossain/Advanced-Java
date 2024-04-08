package com.java.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.first.model.CloudVendor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/cloudevendor")
public class CloudAPIService {

    CloudVendor cloudeVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudeVendorDetails(String vendorId)
    {
       // return new CloudVendor("C1", "Vendor 1", "Address 1","01222222222");

       return cloudeVendor;
    }


    // Create-------------
    @PostMapping
    public String createCloudeVendorDetails(@RequestBody CloudVendor cloudeVendor)
    {
        this.cloudeVendor = cloudeVendor;
        return "Clode vendor Create Successfully";
    }

    // Update-----------------
    @PutMapping
    public String updateCloudeVendorDetails(@RequestBody CloudVendor cloudeVendor)
    {
        this.cloudeVendor = cloudeVendor;
        return "Clode vendor Updated Successfully";
    }

    //Delete-----------------
    @DeleteMapping("{vendorId}")
    public String deleteCloudeVendorDetails(String vendorId)
    {
        this.cloudeVendor = null;
        return "Clode vendor Deleted Successfully";
    }


}
