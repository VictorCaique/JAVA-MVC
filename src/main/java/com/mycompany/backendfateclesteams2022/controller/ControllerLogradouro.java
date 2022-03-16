/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.controller;

import java.util.List;

import com.mycompany.backendfateclesteams2022.model.bean.Logradouro;
import com.mycompany.backendfateclesteams2022.model.dao.DaoLogradouro;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerLogradouro {
	 DaoLogradouro daoLog;
	    
	    public Logradouro inserir(Logradouro l){
	        daoLog = new DaoLogradouro();
	        return daoLog.inserir(l);
	    }
	    
	    public Logradouro alterar(Logradouro l){
	        daoLog = new DaoLogradouro();
	        return daoLog.alterar(l);
	    }
	    
	    public Logradouro excluir(Logradouro l){
	        daoLog = new DaoLogradouro();
	        return daoLog.excluir(l);
	    }
	    
	    public Logradouro buscar(Logradouro l){
	        daoLog = new DaoLogradouro();
	        return daoLog.inserir(l);
	    }
	    
	    public List<Logradouro> listar(Logradouro l){
	        daoLog = new DaoLogradouro();
	        return daoLog.listar(l);
	        
	    }

	   /* public boolean valida(Logradouro logEntrada) {
	        boolean validado = false;
	        daoLog = new DaoLogradouro();
	        Logradouro logSaida = daoLog.valida(logEntrada);
	        if( usuEntrada.getLogin().equals(usuSaida.getLogin()) && usuEntrada.getSenha().equals(usuSaida.getSenha())) {
	            validado = true;
	        }
	        return validado;
	    }*/
}
