/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.model.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class PessoaFisica extends Pessoa {
    
    private String rg;
    private String cpf;
    
    public PessoaFisica(int id) {
        super(id);
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(String nome,String rg, String cpf) {
        super(nome);
        this.rg = rg;
        this.cpf = cpf;
    }

    public PessoaFisica(int id, String nome,String rg, String cpf) {
        super(id, nome);
        this.rg = rg;
        this.cpf = cpf;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "rg=" + rg + ", cpf=" + cpf + '}';
    }
    
}
