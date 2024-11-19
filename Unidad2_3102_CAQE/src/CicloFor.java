import javax.swing.JOptionPane;
public class CicloFor {
    public static void main(String[]args){
        float alumno,prom;
        byte c1,c2,c3,c4,c5;
        
        System.out.println("Ingresa las 5 calificaciones de el alumno");
        for (alumno=1;alumno<=34;alumno++){
             c1=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la primera calificacion por favor"));
             c2=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la segunda calificacion por favor"));
             c3=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la tercera calificacion por favor"));
             c4=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la cuarta calificacion por favor"));
             c5=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la quinta calificacion por favor"));
             prom=(c1+c2+c3+c4+c5)/5;
             System.out.println("Tu promedio es: "+prom);
        }
    }
}
