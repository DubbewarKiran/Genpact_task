package com.example.Genpact_task.Repositorys;

import com.example.Genpact_task.Entitys.Org;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Org_Repository extends JpaRepository<Org,Integer> {
}
