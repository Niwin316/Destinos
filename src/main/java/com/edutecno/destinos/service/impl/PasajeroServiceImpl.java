package com.edutecno.destinos.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edutecno.destinos.modelo.Pasajero;
import com.edutecno.destinos.repository.PasajeroRepository;
import com.edutecno.destinos.service.PasajeroService;
import com.edutecno.destinos.vo.PasajeroVO;

@Service
public class PasajeroServiceImpl implements PasajeroService {

	private static final Logger log = LoggerFactory.getLogger(PasajeroServiceImpl.class);

	@Autowired
	private PasajeroRepository dao;
	private PasajeroVO respuesta;

	@Override
	@Transactional(readOnly = true)
	public PasajeroVO findAll() {
		respuesta = new PasajeroVO(new ArrayList<Pasajero>(), "Ha ocurrido un error", "102");
		try {
			respuesta.setPasajeros((List<Pasajero>) dao.findAll());
			respuesta.setMensaje(String.format("Se ha/n encontrado %dregistro/s", respuesta.getPasajeros().size()));
			respuesta.setCodigo("0");
			System.out.println(respuesta.getPasajeros().get(0).getDestinos().get(0).getCiudad());
		} catch (Exception e) {
			log.trace("Error en findByDestino", e);
		}
		return respuesta;
	}

	@Override
	@Transactional
	public PasajeroVO save(Pasajero pasajero) {
		respuesta = new PasajeroVO(new ArrayList<Pasajero>(), "Ha ocurrido un error", "104");
		try {
			dao.save(pasajero);
			respuesta.setMensaje(String.format("Se ha guardado correctamente el pasajero %s", pasajero.getNombre()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Cliente Service: Error en add", e);
		}
		return respuesta;

	}

	@Override
	public PasajeroVO findAllAndDestiny() {
		respuesta = new PasajeroVO(new ArrayList<Pasajero>(), "Ha ocurrido un error", "102");
		try {
			respuesta.setPasajeros((List<Pasajero>) dao.findAll());
			respuesta.setMensaje(String.format("Se ha/n encontrado %dregistro/s", respuesta.getPasajeros().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Error en findAll", e);
		}
		return respuesta;
	}

}
