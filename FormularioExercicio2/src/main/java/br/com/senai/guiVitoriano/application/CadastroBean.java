package br.com.senai.guiVitoriano.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
@SuppressWarnings("serial")

public class CadastroBean implements Serializable{
	
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		
		if (pessoa == null) {
			
			pessoa.setEnderecoResidencial(new Endereco());
			pessoa.getEnderecoResidencial().setEndereco(new Estado());
			pessoa.setEnderecoComercial(new )
			
		}
		
	}
	
}