package com.edutecno.destinos.service;

import com.edutecno.destinos.modelo.Pasajero;
import com.edutecno.destinos.vo.PasajeroVO;

public interface PasajeroService {

	PasajeroVO save(Pasajero pasajero);

	PasajeroVO findAll();

	PasajeroVO findAllAndDestiny();

}
