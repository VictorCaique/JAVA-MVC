/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.backendfateclesteams2022.model.bean.Logradouro;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class DaoLogradouro {
	public Logradouro inserir(Logradouro l){
        return l;
    }
    
    public Logradouro alterar(Logradouro l){
        return l;
    }
    
    public Logradouro excluir(Logradouro l){
        return l;
    }
    
    public Logradouro buscar(Logradouro l){
        return l;
    }
    
    public List<Logradouro> listar(Logradouro l){
        List<Logradouro> listaUsu = new ArrayList();
        listaUsu.add(l);
        return listaUsu;
    }

   /* public Logradouro valida(Logradouro usuEntrada) {
    	Logradouro usuSaida = new Logradouro("BITTENCOURT","BITTEN");
        return usuSaida;
    }*/
}
