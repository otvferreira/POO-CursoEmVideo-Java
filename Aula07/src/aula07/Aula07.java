/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

/**
 *
 * @author otvfe
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l1 = new Lutador();
        Lutador l2 = new Lutador();
        Lutador l3 = new Lutador();
        Lutador l4 = new Lutador();
        Lutador l5 = new Lutador();
        Lutador l6 = new Lutador();
        l1.apresentar("Pretty Boy", "França", 31, 1.75f, 68.9f, "Leve", 11, 2, 1);
        l2.apresentar("Putscript", "Brasil", 29, 1.68f, 57.8f, "Leve", 14, 2, 3);
        l3.apresentar("Snapshadow", "EUA", 35, 1.65f, 80.9f, "Medio", 12, 2, 1);
        l4.apresentar("Dead Code", "Austrália", 28, 1.93f, 81.6f, "Medio", 13, 0, 2);
        l5.apresentar("Ufocobol", "Brasil", 37, 1.70f, 119.3f, "Pesado", 5, 4, 3);
        l6.apresentar("Nerdaard", "EUA", 30, 1.81f, 105.7f, "Pesado", 12, 2, 4);
        
        l1.status();
        l2.status();
        l3.status();
        l4.status();
        l5.status();
        l6.status();
    }
    
}
