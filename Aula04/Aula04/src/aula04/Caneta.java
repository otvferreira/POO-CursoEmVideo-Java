/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author otvfe
 */
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    public void Caneta(){ //Construct
        this.tampar();
        this.cor = "Azul";
        
    }
    public String getmodelo(){
        return this.modelo;
    }
    
    public void setmodelo(String m){
        this.modelo = m;   
    }
    
    public float getponta(){
        return this.ponta;
    }
    
    public void setponta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Modelo: " + this.getmodelo());
        System.out.println("Ponta: " + this.getponta());
    }
    
}
