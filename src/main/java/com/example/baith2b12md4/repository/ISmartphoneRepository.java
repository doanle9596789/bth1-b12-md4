package com.example.baith2b12md4.repository;


import com.example.baith2b12md4.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
}