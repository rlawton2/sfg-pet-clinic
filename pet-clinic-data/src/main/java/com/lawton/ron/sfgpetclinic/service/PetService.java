package com.lawton.ron.sfgpetclinic.service;

import com.lawton.ron.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
