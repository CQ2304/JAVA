import javax.swing.JOptionPane;
public class TeGane {
    public static void main(String[]args){
        double a,b;
        JOptionPane.showMessageDialog(null,"Vamos a ver quien tiene un numero mas grande");
        a=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu numero y yo eligire el mio"));
        if(a>0){
           b=a+.1; 
           JOptionPane.showMessageDialog(null,"Tu numero es: "+a+"    Mi numero es: "+b);
           JOptionPane.showMessageDialog(null,"TE GANE TE GANE TE GANE TE GANE TE GANE TE GANE TE GANE TE GANE TE GANE TE GANE TE GANE");
        }
        else if(a<=0){
            b=a-.1;
            JOptionPane.showMessageDialog(null,"Tu numero es: "+a+"    Mi numero es: "+b);
            JOptionPane.showMessageDialog(null,"ME GANASTE ME GANASTE ME GANASTE ME GANASTE ME GANASTE ME GANASTE ME GANASTE ME GANASTE");
        }
       
        
        
    }
    
}
