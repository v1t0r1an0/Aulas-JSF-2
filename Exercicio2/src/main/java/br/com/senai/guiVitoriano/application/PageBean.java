package br.com.senai.guiVitoriano.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
@SuppressWarnings("serial")

public class PageBean implements Serializable{	
	
	private String texto;

	@Inject
	private Flash flash;
	
	public String inverter(){
		
		StringBuilder SB = new StringBuilder();
		
		return SB.reverse().toString();
		
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}