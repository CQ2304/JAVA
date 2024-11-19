import javax.swing.JOptionPane;
public class MateriasCalificaciones {
    //Declaracion de atributos o variables miembro
    public static void main(String[]Cri){
        //Declaracion de variables del metodo :)
        byte x, y;
        byte cal[][]=new byte[6][4];
        String materias[]={"MatemDis","FundaInv","FundaPro","CalcDife","Quimica","DesaSust"};
        String encabezado[]={"Asignatura","U1","U2","U3","U4"};
        
        //SE IMPRIMIO EL ENCABEZADO
        for(x=0;x<5;x++){
            System.out.print(encabezado[x]+"\t");
        }
        
        //Pedir calificaciones por materia
        for(x=0;x<6;x++){
            for(y=0;y<4;y++){
                cal[x][y]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa calificacion de la "+encabezado[y+1]+" de la materia "+materias[x]));
                System.out.println("\n"+materias[x]);
                System.out.print("\t"+cal[x][y]);
            }
        }               
    } 
}
