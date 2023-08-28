package com.example.Genpact_task.Controllers;


import com.example.Genpact_task.Entitys.Address;
import com.example.Genpact_task.Entitys.Org;
import com.example.Genpact_task.Services.Org_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/org")
public class Org_Controller {

    @Autowired
    Org_Service orgService;

    @PostMapping("/add_org")
    public String add_org(@RequestBody Org org){
        orgService.add_org(org);
        return " Successfully Org added";
    }

    @GetMapping("/getOrg")
    public Org getOrg(@RequestParam("id") int id){
        return orgService.getOrg(id);
    }

    @GetMapping("/all_Addresses_Of_Org")
    public List<Address> all_Addresses_Of_Org(@RequestParam("id") int id){
        return orgService.all_Addresses_Of_Org(id);
    }
}
