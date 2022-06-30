package com.example.spring_database.controller;

import com.example.spring_database.model.Offices;
import com.example.spring_database.service.OfficesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/offices")
public class OfficesController {

    private final OfficesService officesService;

    @Autowired
    public OfficesController(OfficesService officesService){
        this.officesService = officesService;
    }

    @GetMapping
    public List<Offices> getOffices() {
        return officesService.getOffices();

    }

    @PostMapping
    public void registerNewOffice(@RequestBody Offices office){
        officesService.addNewOffice(office);
    }

}
