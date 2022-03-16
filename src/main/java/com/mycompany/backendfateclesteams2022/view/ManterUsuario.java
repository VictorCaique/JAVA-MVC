/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendfateclesteams2022.view;

import com.mycompany.backendfateclesteams2022.model.bean.Usuario;
import com.mycompany.backendfateclesteams2022.controller.ControllerUsuario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManterUsuario {
    
    public static void inserir(){
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        String status = JOptionPane.showInputDialog("Status");
        String tipo = JOptionPane.showInputDialog("Tipo");
        Usuario usuEnt = new Usuario(login, senha, status, tipo);
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSai = contUsu.inserir(usuEnt);
        JOptionPane.showMessageDialog(null, usuSai.toString());
    }
    
    public static void alterar(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        String status = JOptionPane.showInputDialog("Status");
        String tipo = JOptionPane.showInputDialog("Tipo");
        Usuario usuEnt = new Usuario(id,login, senha, status, tipo);
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSai = contUsu.alterar(usuEnt);
        JOptionPane.showMessageDialog(null, usuSai.toString());
        
    }
    
    public static void excluir(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        Usuario usuEnt = new Usuario(id);
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSai = contUsu.excluir(usuEnt);
        JOptionPane.showMessageDialog(null, usuSai.toString());
    }
    
    public static void buscar(){
        
        int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com Id"));
        Usuario usuEnt = new Usuario(id);
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usuSai = contUsu.buscar(usuEnt);
        JOptionPane.showMessageDialog(null, usuSai.toString());
        
    }
    
    public static void listar(){
        
        String login = JOptionPane.showInputDialog("Login");
        Usuario usuEnt = new Usuario(login);
        ControllerUsuario contUsu = new ControllerUsuario();
        List<Usuario> listaSaida = contUsu.listar(usuEnt);
        listaSaida.forEach(usu -> {
            JOptionPane.showMessageDialog(null, usu.toString());
        });
        
    }

    public static boolean valida() {
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        Usuario usuEntrada = new Usuario(login, senha);
        ControllerUsuario contUsu = new ControllerUsuario();
        return contUsu.valida(usuEntrada);     
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
