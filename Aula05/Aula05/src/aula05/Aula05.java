/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

/**
 *
 * @author otvfe
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta p1 = new Conta();
        p1.setNumConta(1234);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        Conta p2 = new Conta();
        p2.setNumConta(4321);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(100);
        
        //p1.sacar(150);
        //p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
