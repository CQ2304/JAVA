import javax.swing.JOptionPane;
public class Veterinaria {
   public static void main(String[]args) {
       System.out.println("PATITAS PELUDAS");
       String x;
       long a,b = 500,c = 520,d = 350,e = 400;
       x=(JOptionPane.showInputDialog("Ingresa el tipo de animal Perro Gato Conejo Cuyo"));
       switch (x) {
           case "Perro" -> {
               a=b-(500*20/100);
               System.out.println("El costo de la operacion sera: "+a);
           }
           case "Gato" -> {
               a=c-(520*10/100);
               System.out.println("El costo de la operacion sera: "+a);
           }
           case "Conejo" -> {
               a=d-(350*50/100);
               System.out.println("El costo de la operacion sera: "+a);
           }
           case "Cuyo" -> {
               a=e-(400*80/100);
               System.out.println("El costo de la operacion sera: "+a);
           }
           
       }
       
   }
}
