package com.sap.scholarapp.services;

import com.sap.scholarapp.entity.Scholar;
import com.sap.scholarapp.repository.ScholarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ScholarService {

    @Autowired
    private ScholarRepository scholarRepository;
    private static int count=0;

    public List<Scholar> getAllScholars(){
        return scholarRepository.findAll();
    }

    public void addScholar(Scholar scholar)
    {
        //String idd = String.valueOf(ScholarService.count);
        String uuid= UUID.randomUUID().toString().replace("-", "");
        scholar.setId(uuid);
        scholarRepository.save(scholar);
    }

}
