package com.example.Genpact_task.Controllers;


import com.example.Genpact_task.Entitys.Address;
import com.example.Genpact_task.Services.Address_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class Addresss_Controller {

    @Autowired
    Address_Service addressService;

    @PostMapping("/add_address")
    public String add_address(@RequestBody Address address){
        addressService.add_address(address);
        return "Successfully added address...";

    }

    @GetMapping("/getAddress_ById")
    public Address getAddress_ById(@RequestParam("id") int id){
        return addressService.getAddress_ById(id);
    }

}
