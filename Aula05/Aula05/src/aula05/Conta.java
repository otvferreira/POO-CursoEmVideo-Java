/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author otvfe
 */
public class Conta {
    public int  numConta;
    protected String tipo; // CC - Corrente e CP - Poupanca
    private String dono;
    private float saldo;
    private boolean status;
    
    public Conta(){ // Construct
        this.status = false;
        this.saldo = 0;
    
    }
    
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        
        if (this.tipo == "CC"){
            setSaldo(50);
        } else if (this.tipo == "CP"){
            setSaldo(150);
        }
        
    }
    
    public void fecharConta(){
        if (this.saldo > 0){
            System.out.println("Você possui saldo em sua conta, saque para fechar");
        } else if (saldo < 0) {
            System.out.println("Seu saldo é negativo, pague para fechar a conta");
        } else {
            System.out.println("Conta fechada!");
            this.status = false;
        }
    }
    
    public void depositar(float valord){
        if (this.status == true){
            setSaldo((float)(getSaldo() + valord));
        } else {
            System.out.println("Conta fechada, não é possivel depositar!");
        }    
    }
    
    public void sacar(float valors){
        if (this.status == true){
            if (saldo >= valors){
                setSaldo((float)(getSaldo() - valors));
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
            if (getTipo() == "CC"){
                v = 12;
            } else if (getTipo() == "CP"){
                v = 20;
            }
        
        
        if (this.status == true){
            if (getSaldo() >= v){
                setSaldo(getSaldo() - v);   
                System.out.println("Mensalidade paga, novo saldo " + getSaldo() + "R$");
            } else {   
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta fechada!");
        }
    }

    public float getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
}
