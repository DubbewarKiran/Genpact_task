package com.example.Genpact_task.Repositorys;


import com.example.Genpact_task.Entitys.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Address_Repository extends JpaRepository<Address, Integer> {
}
