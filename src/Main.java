import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ddo=0;
        int vds=5;
        int pts=0;
        int tecl1=1;
        int ron=0;

        System.out.println("**MENU**");
        System.out.println("dado=1, se resta una vida");
        System.out.println("Dado=2 o 4, se suma un punto");
        System.out.println("Dado=3 o 5, no pasa nada");
        System.out.println("Dado=6, se suman 3 puntos");
        System.out.println("el juego termina con 10 o mas puntos o si no quedan vidas");
        System.out.println("//////////////////////////////////////////////////////////");

        Random ale= new Random();

        while(vds!=0 && pts<=9 && tecl1==1){

            ron++;

            System.out.println("vidas= "+vds+"//puntos= "+pts);
            System.out.println("lanzar dado= 1// salir= 2");
            Scanner tcl = new Scanner(System.in);
            tecl1 =tcl.nextInt();
            Random ale2= new Random();
            ddo= ale2.nextInt(6 - 1 + 1) +1;
            System.out.println("////////////////////////////////");
            if (ddo==1){
                vds--;
            }else if(ddo==2 || ddo==4){
                pts++;
            }else if(ddo==3 || ddo==5){
                System.out.println("no sucede nada");
            }else if(ddo==6){
                pts+=3;
            }
            System.out.println("Ronda numero: "+ron);
            System.out.println("el numero del dado fue: "+ddo);
        }
        System.out.println("El juego termino");
        System.out.println("Vidas= "+vds+" Puntos= "+pts);

    }
}