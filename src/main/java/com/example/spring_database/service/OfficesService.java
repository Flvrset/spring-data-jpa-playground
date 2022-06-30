package com.example.spring_database.service;

import com.example.spring_database.model.Offices;
import com.example.spring_database.repository.OfficesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class OfficesService {

    private final OfficesRepository officesRepository;

    @Autowired
    public OfficesService(OfficesRepository officesRepository){
        this.officesRepository = officesRepository;
    }

    public List<Offices> getOffices() {
        return officesRepository.findAll();
    }

    public void addNewOffice(Offices office) {
        Optional<Offices> officeByPhone = officesRepository.findOfficesByPhone(office.getPhone());
        if (officeByPhone.isPresent()){
            throw new IllegalStateException("An office already exists.");
        }
        officesRepository.save(office);
    }
}
