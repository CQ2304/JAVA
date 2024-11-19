public class Hospital {
    public static void main(String[]args){
        //Declaracion de variables
        long A,B,C,D,E,T = 2000000;
        long S;
        System.out.println("Este fue el uso del los 2 millones de pesos");
        //Impreseion de texto 
           A=(T*20/100);
           //Calculo del porcentaje
        System.out.println("Se designo 20% a pediatria, lo cual es: $"+A);
           //Impreseion de texto 
           B=(T*15/100);
            //Calculo del porcentaje
        System.out.println("Se designo 15% a Analisis Clinicos, lo cual es: $"+B);
           //Impreseion de texto 
           C=(T*40/100);
            //Calculo del porcentaje
        System.out.println("Se designo 40% a Ginecologia, lo cual es: $"+C);
           //Impreseion de texto 
           D=(T*10/100);
            //Calculo del porcentaje
        System.out.println("Se designo 10% a sanitarios, lo cual es: $"+D);
        //Impreseion de texto 
           S=T-A-B-C-D;
           //Resta del valores anteriores para calcular porcentaje
           E=(S*100/T);
            //Calculo del porcentaje
        System.out.println("Sobro: "+E+"%, lo cual equivale a: $"+S);
           //Impreseion de texto A
       }
    }
