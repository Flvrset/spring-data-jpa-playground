package com.example.spring_database.service;

import com.example.spring_database.model.Offices;
import com.example.spring_database.repository.OfficesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
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
            throw new IllegalStateException("The office already exists.");
        }
        officesRepository.save(office);
    }

    public void deleteOffice(Long officeCode) {
        officesRepository.deleteById(officeCode);
    }

    @Transactional
    public void updateOffice(Long officeCode, String phone, String city, String postalCode) {
        Offices office = officesRepository.findById(officeCode)
                .orElseThrow(() -> new IllegalStateException(
                        "Office with id " + officeCode + " does not exist"
                ));

        if (phone != null &&
                phone.length() > 0 &&
                !Objects.equals(office.getPhone(), phone)) {
            Optional<Offices> optionalOffices = officesRepository.findOfficesByPhone(phone);
            if (optionalOffices.isPresent()) {
                throw new IllegalStateException("An office of the following phone number: " + phone + " already exist.");
            }
            office.setPhone(phone);
        }

        if (city != null &&
                city.length() > 0 &&
                !Objects.equals(office.getCity(), city)) {
            office.setCity(city);
        }

        if (postalCode != null &&
                postalCode.length() > 0 &&
                !Objects.equals(office.getPostalCode(), postalCode)){
            office.setPostalCode(postalCode);
        }
    }
}
