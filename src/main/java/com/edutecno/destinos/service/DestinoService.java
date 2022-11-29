package com.edutecno.destinos.service;

import com.edutecno.destinos.modelo.Destino;
import com.edutecno.destinos.vo.DestinoVO;

public interface DestinoService {

	DestinoVO save(Destino destino);

	DestinoVO findAll();
}
