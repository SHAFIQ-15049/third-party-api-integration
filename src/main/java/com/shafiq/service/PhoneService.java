package com.shafiq.service;

import com.shafiq.domain.Phone;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface PhoneService {

    public Phone save(Phone phone);

    List<Phone> findAllPhones();

    Optional<Phone> findById(Long id);

    public void deleteById(Long id);
}
