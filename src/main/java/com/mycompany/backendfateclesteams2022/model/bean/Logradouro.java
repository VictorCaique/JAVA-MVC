/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.model.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Logradouro {
    
    private int id;
    private String end;
    private String cep;
    private int numero;
    private String compl;
	
    public Logradouro(String end, String cep, int numero, String compl) {
		super();
		this.end = end;
		this.cep = cep;
		this.numero = numero;
		this.compl = compl;
	}

	public Logradouro(String end, String cep, int numero) {
		super();
		this.end = end;
		this.cep = cep;
		this.numero = numero;
	}

	public Logradouro(int id, String end, String cep, int numero, String compl) {
		super();
		this.id = id;
		this.end = end;
		this.cep = cep;
		this.numero = numero;
		this.compl = compl;
	}

	
	public Logradouro(String end) {
		super();
		this.end = end;
	}

	public Logradouro(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCompl() {
		return compl;
	}

	public void setCompl(String compl) {
		this.compl = compl;
	}

	@Override
	public String toString() {
		return "Logradouro [id=" + id + ", end=" + end + ", cep=" + cep + ", numero=" + numero + ", compl=" + compl
				+ "]";
	}
    
    
    
}
