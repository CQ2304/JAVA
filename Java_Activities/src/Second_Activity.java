import javax.swing.JOptionPane;
public class Second_Activity {
   public static void main (String[]args){
       byte x,y;
       long z;
       System.out.println("Ingresa dos valores porfavor");
       x=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el primer valor"));
        y=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el segundo valor"));
        z=x+y;
      System.out.println("Es resultado de la suma es : "+ z);  
   } 
}
