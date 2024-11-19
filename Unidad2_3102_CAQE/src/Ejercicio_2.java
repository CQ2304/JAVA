//EJERCICIO 2
import javax.swing.JOptionPane;
public class Ejercicio_2 {
    public static void main (String[]args){
        //Declaracion de Variables
        byte a,b,c;
        
        System.out.println("Cual es mayor?");
        a=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el primer valor"));
        b=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el segundo valor"));
        c=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el tercer valor"));
        if (a==c){
            System.out.println("Error: El primer y tercer valor son iguales");
        }
        if (b==c){
            System.out.println("Error: El segundo y tercer valor son iguales");
        }
        if (a==b){
            System.out.println("Error: El primer y segundo termino son iguales");
        }
        if (a>b && a>c){
            //Primer valor
            System.out.println(a +" Es mayor");
        } 
        else if (b>a && b>c){
            //Segundo Valor
            System.out.println(b +" Es Mayor");
        }
        else if (c>a && c>b){
            System.out.println(c +" Es mayor");
        }
    }
    
}
