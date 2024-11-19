//PAR O IMPAR
import javax.swing.JOptionPane;
public class Ejercicio_6 {
    public static void main(String[]args){
        //DECLARACION DE VARIABLES
        long N;
        float p;
        //ENTRADA
        System.out.print("PAR O IMPAR");
        N=Long.parseLong(JOptionPane.showInputDialog("Ingresa un numero por favor"));
        //EL CALCULO
         p=N%2;
        if (p==0){
            System.out.println("Tu numero es:"+ N +" y es par"); 
    }
        else{
            System.out.println("Tu numero es:"+ N +" y es inpar");
        }
    }
    
}
