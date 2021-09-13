package com.webdesignerportalimigrante.ongs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webdesignerportalimigrante.ongs.domain.Ongs;
import com.webdesignerportalimigrante.ongs.exception.OngsNotFoundException;
import com.webdesignerportalimigrante.ongs.repository.OngsRepository;

@RestController
public class OngsController {

    @Autowired
    OngsRepository repository;

    @GetMapping("/ongs")
    List<Ongs> findAllOngs() {
        return repository.findAll();
    }

    @PostMapping("/ongs")
    Ongs createNewOngEntity(@RequestBody Ongs newOngs) {
        return repository.save(newOngs);
    }

    @GetMapping("/ongs/{id}")
    Ongs findOngById(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new OngsNotFoundException(id));
    }

    @PutMapping("/ongs/{id}")
    Ongs updateOngById(@RequestBody Ongs newOngs, @PathVariable Long id) {
        return repository.findById(id)
                .map(Ongs -> {
                    Ongs.setName(newOngs.getName());
                    Ongs.setEmail(newOngs.getEmail());
                    return repository.save(Ongs);
                })
                .orElseGet(() -> {
                    newOngs.setId(id);
                    return repository.save(newOngs);
                });
    }

    @DeleteMapping("/ongs/{id}")
    void deleteOngs(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
