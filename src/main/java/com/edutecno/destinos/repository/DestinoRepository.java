package com.edutecno.destinos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.edutecno.destinos.modelo.Destino;

@Repository
public interface DestinoRepository extends CrudRepository<Destino, Integer> {

}
