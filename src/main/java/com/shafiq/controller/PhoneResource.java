package com.shafiq.controller;

import com.shafiq.domain.Phone;
import com.shafiq.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PhoneResource {

    @Autowired
    private PhoneService phoneService;

    @PostMapping("/phones")
    public ResponseEntity<Phone> createPhone(@RequestBody Phone phone){
        return new ResponseEntity<>(phoneService.save(phone), HttpStatus.CREATED);
    }

    @PutMapping("/phones")
    public ResponseEntity<Phone> updatePhone(@RequestBody Phone phone)
    {
        return new ResponseEntity<>(phoneService.save(phone),HttpStatus.OK);
    }

    @GetMapping("/phones")
    public ResponseEntity<List<Phone>> findAllPhones()
    {
        return new ResponseEntity<>(phoneService.findAllPhones(),HttpStatus.OK);
    }

    @GetMapping("/phones/{id}")
    public ResponseEntity<Phone> findPhone(@PathVariable Long id)
    {
        Optional<Phone> myPhone = phoneService.findById(id);
        return new ResponseEntity<>(myPhone.get(),HttpStatus.OK);
    }

    @DeleteMapping("/phones/{id}")
    public ResponseEntity<HttpStatus> deletePhone(@PathVariable  Long id)
    {
        phoneService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
