import javax.swing.JOptionPane;
public class ThirdActivity {
    public static void main(String[]Cri){
         byte x,y;
         int z;
        JOptionPane.showMessageDialog(null,"Multiplicador");
        x=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el primer valor"));
        y=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el segundo valor"));
        z=x*y;
        JOptionPane.showMessageDialog(null,"EL RESULTADO ES: "+z);
        JOptionPane.showMessageDialog(null,"Felicidades el codigo funciono");
        JOptionPane.showMessageDialog(null,"AHORA LARAGTE!");
        
        
    }
}
