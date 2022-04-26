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
	
	private Integer valor01, valor02, valor03;
	
	@Inject
	private Flash flash;
	
	public String somar() {
		
		Integer resultado = valor01 + valor02 + valor03;
		
		flash.put("resul", resultado);
		
		return "result?faces-redirect=true";
		
	}

	public Integer getValor01() {
		return valor01;
	}

	public void setValor01(Integer valor01) {
		this.valor01 = valor01;
	}

	public Integer getValor02() {
		return valor02;
	}

	public void setValor02(Integer valor02) {
		this.valor02 = valor02;
	}

	public Integer getValor03() {
		return valor03;
	}

	public void setValor03(Integer valor03) {
		this.valor03 = valor03;
	}
	
	
	
	
}