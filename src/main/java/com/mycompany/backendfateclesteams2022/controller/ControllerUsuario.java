/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.controller;

import java.util.List;
import com.mycompany.backendfateclesteams2022.model.bean.Usuario;
import com.mycompany.backendfateclesteams2022.model.dao.DaoUsuario;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerUsuario {
    
    DaoUsuario daoUsu;
    
    public Usuario inserir(Usuario u){
        daoUsu = new DaoUsuario();
        return daoUsu.inserir(u);
    }
    
    public Usuario alterar(Usuario u){
        daoUsu = new DaoUsuario();
        return daoUsu.alterar(u);
    }
    
    public Usuario excluir(Usuario u){
        daoUsu = new DaoUsuario();
        return daoUsu.excluir(u);
    }
    
    public Usuario buscar(Usuario u){
        daoUsu = new DaoUsuario();
        return daoUsu.buscar(u);
        
    }
    
    public List<Usuario> listar(Usuario u){
        daoUsu = new DaoUsuario();
        return daoUsu.listar(u);
        
    }

    public boolean valida(Usuario usuEntrada) {
        boolean validado = false;
        daoUsu = new DaoUsuario();
        Usuario usuSaida = daoUsu.valida(usuEntrada);
        if( usuEntrada.getLogin().equals(usuSaida.getLogin()) && usuEntrada.getSenha().equals(usuSaida.getSenha())) {
            validado = true;
        }
        return validado;
    }
}
