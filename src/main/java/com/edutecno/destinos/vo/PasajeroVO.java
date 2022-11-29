package com.edutecno.destinos.vo;

import java.util.List;
import com.edutecno.destinos.modelo.Pasajero;

public class PasajeroVO extends GenericVO {

	private List<Pasajero> pasajeros;

	public PasajeroVO(List<Pasajero> pasajeros, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.pasajeros = pasajeros;
	}

	public PasajeroVO() {
		super();
	}

	@Override
	public String toString() {
		return "PasajeroVO [pasajeros=" + pasajeros + "]";
	}

	public PasajeroVO(List<Pasajero> pasajeros) {
		super();
		this.pasajeros = pasajeros;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

}
