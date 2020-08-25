package com.sap.scholarapp.controller;

import com.sap.scholarapp.entity.Scholar;
import com.sap.scholarapp.services.ScholarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/scholar")

public class ScholarController {

    @Autowired
    private ScholarService scholarService;

    @GetMapping
    public List<Scholar> getAllScholars()
    {
        return scholarService.getAllScholars();
    }

    @PostMapping
    public void addScholar(@RequestBody Scholar scholar)
    {
        scholarService.addScholar(scholar);
    }
}
