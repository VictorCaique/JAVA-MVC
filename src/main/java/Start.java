/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.backendfateclesteams2022.view.ManterUsuario;
import com.mycompany.backendfateclesteams2022.view.ManterPessoaFisica;
import com.mycompany.backendfateclesteams2022.view.ManterLogradouro;
import com.mycompany.backendfateclesteams2022.view.ManterUsuarioPessoa;
import com.mycompany.backendfateclesteams2022.view.ManterEnderecoPessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Start {
    
    static String  msgErroSis = "Opcao Invalido"; 
    static String  msgErroUsu = "Usuario Invalido"; 
    static String  msgMenu = "0 - Sair \n 1 - ManterUsuario \n 2 - ManterPessoa \n 3 - ManterEndereco \n 4 - ManterUsuarioPessoa \n 5 - ManterEnderecoPessoa";

    public static void main(String args[]) {
        if(ManterUsuario.valida()) {
            menu();
        } else {
            JOptionPane.showMessageDialog(null, msgErroUsu);
        }
    }
        
    public static void menu() {
            int ops = Integer.parseInt(JOptionPane.showInputDialog(msgMenu));
            switch(ops) {
                case 0: 
                    int sair = JOptionPane.showConfirmDialog(null, "Deseja Sair");
                    if(sair > 0 ) {
                        menu();
                    } 
                    break;
                case 1:
                    ManterUsuario.menu();
                    break;
                case 2:
                    ManterPessoaFisica.menu();
                    break;
                case 3:
                    ManterLogradouro.menu();
                    break;
                case 4:
                    ManterUsuarioPessoa.menu();
                    break;
                case 5:
                    ManterEnderecoPessoa.menu();
                    break;
            default:
                    JOptionPane.showMessageDialog(null, msgErroSis);
                    menu();
                    break;
        }
   }
}
