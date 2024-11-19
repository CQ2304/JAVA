import javax.swing.JOptionPane;
public class FactorialDoFor {
    public static void main(String[]Cri){
        byte resp, num, x;
        int fact;
        do{
            num=Byte.parseByte(JOptionPane.showInputDialog("Ingresa un numero"));
            fact=1;
            for(x=num;x>=1;x--){
                fact*=x;
                System.out.print(fact+"\t");
            }
            System.out.println("");
            resp=Byte.parseByte(JOptionPane.showInputDialog("Presione 1 para continuar"));
        }while(resp==1);
    }
}
    
        
