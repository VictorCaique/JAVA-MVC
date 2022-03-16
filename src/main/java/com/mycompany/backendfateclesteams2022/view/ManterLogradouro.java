/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.view;

import java.util.List;

import javax.swing.JOptionPane;

import com.mycompany.backendfateclesteams2022.controller.ControllerLogradouro;
import com.mycompany.backendfateclesteams2022.model.bean.Logradouro;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManterLogradouro {
                                                         
	public static void inserir(){                        
        String cep = JOptionPane.showInputDialog("CEP");   
        String end = JOptionPane.showInputDialog("Endereço");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número")); 
        String compl = JOptionPane.showInputDialog("Complemento");
        Logradouro logEnt = new Logradouro(end, cep, numero, compl);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSai = contLog.inserir(logEnt);
        JOptionPane.showMessageDialog(null, logSai.toString());
    }
    
    public static void alterar(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        String cep = JOptionPane.showInputDialog("CEP");   
        String end = JOptionPane.showInputDialog("Endereço");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número")); 
        String compl = JOptionPane.showInputDialog("Complemento");
        Logradouro logEnt = new Logradouro(id, end, cep, numero, compl);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSai = contLog.alterar(logEnt);
        JOptionPane.showMessageDialog(null, logSai.toString());
        
    }
    
    public static void excluir(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        Logradouro logEnt = new Logradouro(id);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSai = contLog.excluir(logEnt);
        JOptionPane.showMessageDialog(null, logSai.toString());
    }
    
    public static void buscar(){
    	int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        Logradouro logEnt = new Logradouro(id);
        ControllerLogradouro contLog = new ControllerLogradouro();
        Logradouro logSai = contLog.buscar(logEnt);
        JOptionPane.showMessageDialog(null, logSai.toString());
    }
    
    public static void listar(){
        
        String end = JOptionPane.showInputDialog("Endereco");
        Logradouro logEnt = new Logradouro(end);
        ControllerLogradouro contLog = new ControllerLogradouro();
        List<Logradouro> listaSaida = contLog.listar(logEnt);
        listaSaida.forEach(log -> {
            JOptionPane.showMessageDialog(null, log.toString());
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
