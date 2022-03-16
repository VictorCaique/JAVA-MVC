/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.model.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class UsuarioPessoa {
    
    private int id;
    private int idU;
    private int idP;
    private Usuario u;
    private Pessoa p;
    String obs;

    public UsuarioPessoa(int id) {
        this.id = id;
    }

    public UsuarioPessoa(String obs) {
        this.obs = obs;
    }

    public UsuarioPessoa(int id, int idU, int idP, String obs) {
        this.id = id;
        this.idU = idU;
        this.idP = idP;
        this.obs = obs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public String toString() {
        return "UsuarioPessoa{" + "id=" + id + ", idU=" + idU + ", idP=" + idP + ", obs=" + obs + '}';
    }
    
    
    
    
    
}
