/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.model.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;
    
    public PessoaJuridica(int id) {
        super(id);
    }
    

    public PessoaJuridica(int id, String cnpj) {
        super(id);
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + '}';
    }
    
    
    
}
