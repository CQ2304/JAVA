import javax.swing.JOptionPane;
public class CicloDoWhileIMC {
    public static void main(String[]cri){
        float peso, estatura, imc;
        byte resp;
        do{ 
            
            peso=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu peso "));

            estatura=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu estatuta en formato de metros"));
            imc=(peso/(estatura*estatura));

            JOptionPane.showMessageDialog(null,"El indice de masa coporal es: "+imc);

            if(imc<18.49){
                System.out.println("PESO BAJO");
            }else if (imc>=18.50 && imc<=24.99){
                System.out.println("PESO NORMAL");  
            }else if(imc>=25 && imc<=29.99){
                System.out.println("SOBREPESO");
            }else if(imc>=30 && imc <=34.99){
                System.out.println("OBESIDAD GRADO I");
            }else if(imc>=35 && imc<=39.99){
                System.out.println("OBESIDAD GRADO II");
            }else{
                System.out.println("OBSEDIDAD MORBIDA");
            } 
            //Actualizacion del DO WHILE
            resp=Byte.parseByte(JOptionPane.showInputDialog("Presione 1 si desea ingresar otro numero"));
        } while(resp==1);  
    }//Cierra el metodo principal
}//Cierra la clase
