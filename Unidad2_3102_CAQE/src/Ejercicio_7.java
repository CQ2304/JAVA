import javax.swing.JOptionPane;
public class Ejercicio_7 {
    public static void main(String[]args){
        //Declarar variables
        byte N;
        System.out.println("Determina tu nota");
        N=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un numero de 1 al 20"));
        if (N==19|N==20){
            System.out.println("Tu nota es A");
        }
        if (N==16|N==17|N==18){
            System.out.println("Tu nota es B");
        }
        if (N==13|N==14|N==15){
            System.out.println("Tu nota es C");
        }
        if (N==10|N==11|N==12){
            System.out.println("Tu nota es D");
        }
        if (N==1|N==2|N==3|N==4|N==5|N==6|N==7|N==8|N==9){
            System.out.println("Tu nota es E");
        }
    }
    
}
