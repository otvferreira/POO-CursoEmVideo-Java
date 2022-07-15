
package poo.cursoemvideo.java;

public class POOCursoEmVideoJava {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Aleatorio";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;

        c1.destampar();
        c1.rabiscar();
        c1.status();        
        
        
        Caneta c2 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Vermelha";
        c1.ponta = (float) 0.7;
        c1.carga = 87;
        
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
    
}
