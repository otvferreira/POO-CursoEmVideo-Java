package aula02;


public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;
   
   public void status(){
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Cor: " + this.cor);
       System.out.println("Ponta: " + this.ponta);
       System.out.println("Carga: " + this.carga + "%");
       System.out.println("Tampada: " + this.tampada);
   }
   public void rabiscar(){
       if (tampada == true){
           System.out.println("ERRO! Caneta tampada.");
       } else {
           System.out.println("Rabiscando");
       }
   }
   protected void tampar(){
       this.tampada = true;
   }
   protected void destampar(){
       this.tampada = false;
   }
}
