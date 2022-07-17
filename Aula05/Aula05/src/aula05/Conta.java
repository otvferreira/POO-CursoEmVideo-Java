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

    public int numConta;
    protected String tipo; // CC - Corrente e CP - Poupanca
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public Conta(){ // Construct
        this.setStatus(false);
        this.setSaldo(0);
    
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if (this.getTipo() == "CC"){
            this.setSaldo(50);
        } else if (this.getTipo() == "CP"){
            this.setSaldo(150);
        }
        
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Você possui saldo em sua conta, saque para fechar");
        } else if (this.getSaldo() < 0) {
            System.out.println("Seu saldo é negativo, não é possível fechar a conta");
        } else {
            System.out.println("Conta fechada!");
            this.setStatus(false);
        }
    }
    
    public void depositar(float valord){
        if (this.isStatus()){
            this.setSaldo((float)(this.getSaldo() + valord));
        } else {
            System.out.println("Conta fechada, não é possivel depositar!");
        }    
    }
    
    public void sacar(float valors){
        if (this.isStatus()){
            if (this.getSaldo() >= valors){
                this.setSaldo((float)(this.getSaldo() - valors));
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
            if (this.getTipo() == "CC"){
                v = 12;
            } else if (this.getTipo() == "CP"){
                v = 20;
            }
        
        
        if (this.isStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);   
                System.out.println("Mensalidade paga, novo saldo " + this.getSaldo() + "R$");
            } else {   
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta fechada!");
        }
    }

    public int getNumConta() {
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
