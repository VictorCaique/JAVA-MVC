/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.view;

import com.mycompany.backendfateclesteams2022.controller.ControllerPessoaFisica;
import com.mycompany.backendfateclesteams2022.model.bean.PessoaFisica;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManterPessoaFisica {

public static void inserir(){
        String nome = JOptionPane.showInputDialog("Nome");
        String rg = JOptionPane.showInputDialog("Rg");
        String cpf = JOptionPane.showInputDialog("Cpf");
        PessoaFisica pesEnt = new PessoaFisica(nome,rg,cpf);
        ControllerPessoaFisica contUsu = new ControllerPessoaFisica();
        PessoaFisica pesSai = contUsu.inserir(pesEnt);
        JOptionPane.showMessageDialog(null, pesSai.toString());
    }
    
    public static void alterar(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        String nome = JOptionPane.showInputDialog("Nome");
        String rg = JOptionPane.showInputDialog("Rg");
        String cpf = JOptionPane.showInputDialog("Cpf");
        PessoaFisica pesEnt = new PessoaFisica(id,nome,rg,cpf);
        ControllerPessoaFisica contUsu = new ControllerPessoaFisica();
        PessoaFisica pesSai = contUsu.alterar(pesEnt);
        JOptionPane.showMessageDialog(null, pesSai.toString());
        
    }
    
    public static void excluir(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        PessoaFisica pesEnt = new PessoaFisica(id);
        ControllerPessoaFisica contUsu = new ControllerPessoaFisica();
        PessoaFisica pesSai = contUsu.excluir(pesEnt);
        JOptionPane.showMessageDialog(null, pesSai.toString());
    }
    
    public static void buscar(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        PessoaFisica pesEnt = new PessoaFisica(id);
        ControllerPessoaFisica contUsu = new ControllerPessoaFisica();
        PessoaFisica pesSai = contUsu.buscar(pesEnt);
        JOptionPane.showMessageDialog(null, pesSai.toString());
    }
    
    public static void listar(){
        
        String nome = JOptionPane.showInputDialog("Login");
        PessoaFisica pesEnt = new PessoaFisica(nome);
        ControllerPessoaFisica contUsu = new ControllerPessoaFisica();
        List<PessoaFisica> listaSaida = contUsu.listar(pesEnt);
        listaSaida.forEach(pes -> {
            JOptionPane.showMessageDialog(null, pes.toString());
        });
        
    }

    public static void menu() {
        
        String msgErro = "Modulo Inválido"; 
        String msgMenu = "0 - Sair \n 1 - Inserir \n 2 - Alterar \n 3 - Excluir \n 4 - Buscar \n 5 - Listar" ;
 
        int modulo = Integer.parseInt(JOptionPane.showInputDialog(msgMenu));

        switch(modulo) {
            case 0:
                int sair = JOptionPane.showConfirmDialog(null, "Deseja Sair");
                    if(sair > 0 ) {
                        menu();
                    } 
                break;
            case 1:
                inserir();
                break;
            case 2:
                alterar();
                break;
            case 3:
                excluir();
                break;
            case 4:
                buscar();
                break;
            case 5:
                listar();
                break;
            default:
                JOptionPane.showMessageDialog(null, msgErro);
                menu();
                break;
        }
    }
}
