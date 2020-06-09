/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionam;

import javax.swing.JOptionPane;

/**
 *
 * @author Thais
 */
public class Estacionam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   EstacionamOpera dados = new EstacionamOpera();   
        
        dados.setPlaca(JOptionPane.showInputDialog("digite a placa: "));
        dados.setModelo(JOptionPane.showInputDialog("digite o modelo do carro: "));
        dados.sethora_entra(Integer.parseInt(JOptionPane.showInputDialog("digite a hora de entrada: "))); 
        dados.setmin_entra(Integer.parseInt(JOptionPane.showInputDialog("digite os minutos de entrada: ")));  
        dados.sethora_saida(Integer.parseInt(JOptionPane.showInputDialog("digite a hora de saida: "))); 
        dados.setmin_saida(Integer.parseInt(JOptionPane.showInputDialog("digite os minutos de saida: ")));  
        
        double tempo_a = dados.tempo_fim(dados.gethora_entra(), dados.getmin_entra(), dados.gethora_saida(), dados.getmin_saida());
        dados.aparece(tempo_a);
 
        
        
    }
    
}
