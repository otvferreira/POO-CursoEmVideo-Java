
package poo.cursoemvideo.java;

public class POOCursoEmVideoJava {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Aleatorio";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;

        c1.destampar();
        c1.status();        
    }
    
}
