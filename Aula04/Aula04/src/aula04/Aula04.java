
package aula04;


public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta ();
        c1.setmodelo("BIC Crystal");
        c1.setponta(0.5f);
        System.out.println("Tenho uma caneta " + c1.getmodelo() + " de ponta " + c1.getponta());
    }
    
}
