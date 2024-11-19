
public class TablasDeMultiplicar {
    public static void main(String[]Cri){
        byte a=1,b;
        long c;
        while(a<=10){
            b=1;
            System.out.println("-------------------------");
            System.out.println("Tabla de multiplicar: "+a);
            System.out.println("-------------------------");
            while(b<=10){
                c=a*b;
                System.out.println(a+"*"+b+"="+c);
               
                b=(byte) (b+1);
            }
            a=(byte) (a+1);
            System.out.println("\t");
        }
    }
}
