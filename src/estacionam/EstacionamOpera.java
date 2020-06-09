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
public class EstacionamOpera {
    
    public String placa, modelo, aparece;
    public int valor; 
    public int hora_entra;
    public int min_entra;
    public int hora_saida;
    public int min_saida;
    public int tempo_fim;

    
    public String getPlaca() {
    return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getModelo() {
    return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
     int gethora_entra() {
    return hora_entra;
    }
    void sethora_entra(int hora_entra) {
        this.hora_entra = hora_entra;
    }
    
    int getmin_entra() {
    return min_entra;
    }
    void setmin_entra(int min_entra) {
        this.min_entra = min_entra;
    }
    
    int gethora_saida() {
    return hora_saida;
    }
    void sethora_saida(int hora_saida) {
        this.hora_saida = hora_saida;
    }
    
    int getmin_saida() {
    return min_saida;
    }
    void setmin_saida(int min_saida) {
        this.min_saida = min_saida;
    }
    
    int getTempo_entra() {
    return min_entra;
    }
    void setTempo_entra(int tempo_entra) {
        this.min_saida = min_saida;
    }
   
    
    public double tempo_fim(double hora_entra, double min_entra, double hora_saida, double min_saida) {
        double tempo_entr = hora_entra + min_entra/60;
        double tempo_saida = hora_saida + min_saida/60;
        tempo_fim = (int) Math.ceil(tempo_saida - tempo_entr);
        
        return this.tempo_fim;
    }
    
    public void aparece (double tempo_fim){
        
        double valor = (tempo_fim*4);
        
    JOptionPane.showMessageDialog(null, "Modelo do carro: " + this.modelo + "\n" + "Placa do carro: " + this.placa + "\n" + "Entrada " + this.hora_entra + ":" + this.min_entra + "\n" +
     "Saida " + this.hora_saida + ":" + this.min_saida + "\n" + "Periodo de permanecia: " + this.tempo_fim + " horas" + "\n" + "Valor a pagar: R$ " + valor);
    }





    
}
