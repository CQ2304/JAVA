//EJERCICIO 1
import javax.swing.JOptionPane;
public class Ejercicio_1 {
    public static void main (String[]args){
        //Declaracion de Variables
        byte a,b;
        
        System.out.println("Cual es mayor?");
        a=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el primer valor"));
        b=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el segundo valor"));
        if(a>b){
            //Primer valor
            System.out.println(a +" Es mayor");
        }
        else {
            //Segundo Valor
            System.out.println(b +" Es mayor");
        }
        }
    }
    

