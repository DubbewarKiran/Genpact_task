package com.example.Genpact_task.Services;


import com.example.Genpact_task.Entitys.Address;
import com.example.Genpact_task.Entitys.Org;
import com.example.Genpact_task.Repositorys.Address_Repository;
import com.example.Genpact_task.Repositorys.Org_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Address_Service {
    @Autowired
    Address_Repository addressRepository;
    @Autowired
    Org_Repository orgRepository;
    public void add_address(Address address) {
        Org org;
        org=orgRepository.findById(address.getOrg__id()).get();

        List<Address> addressList=org.getAddressList();
        System.out.println("Before"+addressList);
        addressList.add(address);
        System.out.println("After"+addressList.get(0));
        org.setAddressList(addressList);

       // addressRepository.save(address);
        orgRepository.save(org);
        System.out.println("Kiran  "+org.getAddressList());
    }

    public Address getAddress_ById(int id) {
        Address address=addressRepository.findById(id).get();

        return address;
    }
}
