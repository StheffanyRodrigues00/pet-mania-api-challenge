package com.dt2.petmania.controllers;

import com.dt2.petmania.entities.Pet;
import com.dt2.petmania.repositories.PetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/pets")
@RestController
public class PetController {

    private final PetRepository repository;
    public PetController(PetRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public List<Pet> mostrar(){
        return repository.findAll();
    }
    @GetMapping
    public void criar(@RequestBody Pet p){
        repository.save(p);
    }

    //CRIE O DELETE
}
