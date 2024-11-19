//AREA Y VOLUMEN DE UN CILINDRO
import javax.swing.JOptionPane;
public class Ejercicio_5 {
    public static void main(String[]args){
        //Declaration de variables
        double R,H,A,V;
        //Titulo y entrada
        System.out.println("Area y Volumen de un Cilindro");
        R=Double.parseDouble(JOptionPane.showInputDialog("INGRESA EL VALOR DEL RADIO"));
        H=Double.parseDouble(JOptionPane.showInputDialog("INGRESA EL VALOR DE LA ALTURA"));
        A=(2*Math.PI*R*H)+(2*Math.PI*(R*R));
        V=(Math.PI*(R*R));
        System.out.println("El Area del cilindro es: "+ A + " Y el volumen es igual a: "+ V);
        
    }
}
