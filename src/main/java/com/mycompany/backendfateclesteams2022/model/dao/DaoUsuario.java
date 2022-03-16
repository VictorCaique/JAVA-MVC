/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.model.dao;

import com.mycompany.backendfateclesteams2022.model.bean.Usuario;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class DaoUsuario {
    
    public Usuario inserir(Usuario u){
        return u;
    }
    
    public Usuario alterar(Usuario u){
        return u;
    }
    
    public Usuario excluir(Usuario u){
        return u;
    }
    
    public Usuario buscar(Usuario u){
        return u;
    }
    
    public List<Usuario> listar(Usuario u){
        List<Usuario> listaUsu = new ArrayList();
        listaUsu.add(u);
        return listaUsu;
    }

    public Usuario valida(Usuario usuEntrada) {
        Usuario usuSaida = new Usuario("BITTENCOURT","BITTEN");
        return usuSaida;
    }
    
}
