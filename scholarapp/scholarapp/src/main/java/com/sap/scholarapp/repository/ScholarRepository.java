package com.sap.scholarapp.repository;

import com.sap.scholarapp.entity.Scholar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScholarRepository extends JpaRepository<Scholar,String>{

    List<Scholar> findAllByBatch(String batch);
    Scholar findByNameAndBatch(String name, String batch);
//    Scholar findByBatchAndAddress(String batch, String address);

}


