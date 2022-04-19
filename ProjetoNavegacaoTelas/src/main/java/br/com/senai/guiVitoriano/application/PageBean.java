package br.com.senai.guiVitoriano.application;


import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped 

public class PageBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String page;

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	public String go_to(){
		if("a".equals(page)) {
			return "page_a";
		}else if("b".equals(page)) {
			return "page_b";
		}else {
			return null;
		}
			
	}
	
}
