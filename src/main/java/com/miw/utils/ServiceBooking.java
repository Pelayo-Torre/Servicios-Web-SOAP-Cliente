package com.miw.utils;

public class ServiceBooking {
	
	private Long [] seleccionados;
	private Long idBooking;
	private Long idClient;
	private Long idService;
	private boolean selected;
	private String name;
	
	public Long[] getSeleccionados() {
		return seleccionados;
	}
	
	public void setSeleccionados(Long[] seleccionados) {
		this.seleccionados = seleccionados;
	}

	public Long getIdBooking() {
		return idBooking;
	}

	public void setIdBooking(Long idBooking) {
		this.idBooking = idBooking;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIdService() {
		return idService;
	}

	public void setIdService(Long idService) {
		this.idService = idService;
	}
		
}
