package com.shafiq.service;

import com.shafiq.domain.Phone;
import com.shafiq.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneServiceImpl implements PhoneService{

    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public Phone save(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public List<Phone> findAllPhones() {
        return phoneRepository.findAll();
    }

    @Override
    public Optional<Phone> findById(Long id) {
        return phoneRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        phoneRepository.deleteById(id);
    }
}
