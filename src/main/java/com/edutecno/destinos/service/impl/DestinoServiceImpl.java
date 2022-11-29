package com.edutecno.destinos.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.edutecno.destinos.modelo.Destino;
import com.edutecno.destinos.repository.DestinoRepository;
import com.edutecno.destinos.service.DestinoService;
import com.edutecno.destinos.vo.DestinoVO;

@Service
public class DestinoServiceImpl implements DestinoService {

	private static final Logger log = LoggerFactory.getLogger(DestinoServiceImpl.class);

	@Autowired
	private DestinoRepository dao;
	private DestinoVO respuesta;

	@Override
	@Transactional(readOnly = true)
	public DestinoVO findAll() {
		respuesta = new DestinoVO(new ArrayList<Destino>(), "Ha ocurrido un error", "102");
		try {
			respuesta.setDestinos((List<Destino>) dao.findAll());
			respuesta.setMensaje(String.format("Se han encontrado destinos", respuesta.getDestinos().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Error en findAll", e);
		}
		return respuesta;
	}

	@Override
	@Transactional
	public DestinoVO save(Destino destino) {
		respuesta = new DestinoVO(new ArrayList<Destino>(), "Ha ocurrido un error", "104");
		try {
			dao.save(destino);
			respuesta.setMensaje(String.format("Se ha guardado", destino.getCiudad()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace(" Error en save", e);
		}
		return respuesta;
	}

}
