//Importacion de Paquetes
import javax.swing.JOptionPane;

public class HolaMundo {
    public static void main (String [] args){
        //Declaracion de variables
        byte b,h;
        float area;
        
        System.out.println("AREA DEL TRIANGULO");
        b=Byte.parseByte(JOptionPane.showInputDialog("Ingresa base"));
        h=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la Altura"));
        area=(b*h)/2;
        System.out.println("El area del triangulo es"+ area);
    }
    
}
