import javax.swing.JOptionPane;
public class FactorialFor {
    public static void main(String[]Cri){
        byte num, x;
        int fact=1;
        //calculo del factorial
        num=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un numero"));
        for (x=num; x>=1;x--){
            fact*=x;
            System.out.print(fact+"\t");
        }
    }
}
