package com.example.Genpact_task.Services;

import com.example.Genpact_task.Entitys.Address;
import com.example.Genpact_task.Entitys.Org;
import com.example.Genpact_task.Repositorys.Org_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Org_Service {

    @Autowired
    Org_Repository orgRepository;
    public void add_org(Org org) {
        orgRepository.save(org);
    }

    public Org getOrg(int id) {
        return orgRepository.findById(1).get();
    }
    public List<Address> all_Addresses_Of_Org(int id) {
        Org org = orgRepository.findById(id).get();

        return org.getAddressList();
    }


}
