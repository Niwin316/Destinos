package com.edutecno.destinos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.edutecno.destinos.modelo.Pasajero;

@Repository
public interface PasajeroRepository extends CrudRepository<Pasajero, Integer> {

}
