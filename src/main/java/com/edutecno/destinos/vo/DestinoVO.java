package com.edutecno.destinos.vo;

import java.util.List;
import com.edutecno.destinos.modelo.Destino;

public class DestinoVO extends GenericVO {

	private List<Destino> destinos;

	public DestinoVO() {
		super();
	}

	public DestinoVO(List<Destino> destinos) {
		super();
		this.destinos = destinos;
	}

	public DestinoVO(List<Destino> destinos, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.destinos = destinos;
	}

	public List<Destino> getDestinos() {
		return destinos;
	}

	public void setDestinos(List<Destino> destinos) {
		this.destinos = destinos;
	}

}
