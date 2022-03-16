/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.model.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class PessoaEndereco {
    
    private int id;
    private int idP;
    private int idE;
    private Pessoa p;
    private Logradouro e;
    private String obs;

    public PessoaEndereco(int id) {
        this.id = id;
    }

    public PessoaEndereco(String obs) {
        this.obs = obs;
    }

    public PessoaEndereco(int id, int idP, int idE, String obs) {
        this.id = id;
        this.idP = idP;
        this.idE = idE;
        this.obs = obs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public Logradouro getE() {
        return e;
    }

    public void setE(Logradouro e) {
        this.e = e;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public String toString() {
        return "PessoaEndereco{" + "id=" + id + ", idP=" + idP + ", idE=" + idE + ", obs=" + obs + '}';
    }
    
    
    
    
}
