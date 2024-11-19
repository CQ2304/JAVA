import javax.swing.JOptionPane;
public class Ejercicio_4 {
    public static void main (String[]args){
        //Declaracion de variables
        short CatA,CatB;
        long CatA2,CatB2,Hip;
        
        //Entradas
        System.out.println("VALORES DE LOS CATETOS");
        CatA=Short.parseShort(JOptionPane.showInputDialog("Ingresa el Cateto A"));
        CatB=Short.parseShort(JOptionPane.showInputDialog("Ingresa el Cateto B"));
        //Operaciones 2
        CatA2=(CatA*CatA);
        CatB2=(CatB*CatB);
        Hip=(CatA2+CatB2);
        //Resultado
        System.out.println("La Hipotenusa es igual a: "+ Hip);
    }
    
}
