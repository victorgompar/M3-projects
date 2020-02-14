/*
SUBPROGRAMAS METODOS: FUNCION+ PROCEDIMIENTOS
CONVERSIONES
*/

package p17;

import java.util.Scanner;


public class P17 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        double price, tax, pvp;
        price=100;
        tax=21;
        pvp=functionGerard(price, tax);
        System.out.println(pvp);
         int option =-1;
         int euro;
         String euro1;
         float euro2;
         float dolars;
         double dolars1;
         String dolars2;
         int dolars3;
         char letterChar;
         int letterInt;
         String letterChar3;
         
                
        do{
            userMenu();
            option = keyboard.nextInt();
          switch (option) {//inicio switch
            case 1:
                System.out.print("Euros= ");
                euro=keyboard.nextInt();
                dolars =pr1(euro);
                System.out.println(dolars);
                break;
            case 2:
                System.out.print("Euros= ");
                euro=keyboard.nextInt();
                dolars1 = pr2(euro);
                System.out.println(dolars1);
                break;
            case 3:
                System.out.print("Euros= ");
                euro=keyboard.nextInt();
                dolars2 = pr3(euro);
                System.out.println(dolars2);
                break;
            case 4:
                System.out.print("Euros= ");
                euro1=keyboard.next();
                dolars3 = pr4(euro1);
                System.out.println(dolars3);
                break;
            case 5:
                System.out.print("Euros= ");
                euro=keyboard.nextInt();
                dolars3 = pr5(euro);
                System.out.println(dolars3);
                break;
            case 6:
                System.out.print("Euros= ");
                euro2=keyboard.nextInt();
                dolars2 = pr6(euro2);
                System.out.println(dolars2);
                break;
            case 7:
                System.out.print("Letra= ");
                letterChar = keyboard.next().charAt(0);
                letterInt = (int)letterChar;
                String letterChar2 = pr7(letterInt);
                System.out.println(letterChar2);
                break;
            case 8:
                System.out.print("Nombre= ");
                letterChar3 = keyboard.next();
                String letterString2 = pr8(letterChar3);
                System.out.println(letterString2);
                break;
            case 9:
                System.out.print("Euros= ");
                int numInt=keyboard.nextInt();
                String numberCH=pr9(numInt);
                System.out.println(numberCH);
                break; 
            case 10:
                System.out.println("ASCII");                     
                for (int I = 32; I < 64; I++) {                         
                String numberhexad = pr10(I);                         
                System.out.print(I + "-" + (char) (I) + "-" + numberhexad + "\t");                         
                numberhexad = pr10(I + 32);                         
                System.out.print((I + 32) + "-" + (char) (I + 32) + "-" + numberhexad + "\t");                         
                numberhexad = pr10(I + 64);                        
                System.out.print((I + 64) + "-" + (char) (I + 64) + "-" + numberhexad + "\t");                         
                System.out.println("");                         }
            case 0:
                p0();
                break;

               default: System.out.println("Opcion no valida"); 
        }//fin switch
      }while( option !=0);//fin do while

    }
    
    
    //function
    private static double functionGerard(double precio, double iva){
        double result=0;
        //calculo
        result=precio+ precio*iva/100;
        return result;
    }

    private static float pr1(int boxEuro) {
        float result =0;
        result=boxEuro*1.1f;
        return result;
    }

    private static double pr2(int boxEuro) {
        double result=0;
        result = (double)(boxEuro*1.1);
        return result;
    }

    private static String pr3(int boxEuro) {
        String result ="0";
        result=String.valueOf(boxEuro*1.1);
        return result;
    }

    private static int pr4(String boxEuro) {
        int result =0;
        result=Integer.parseInt(boxEuro);
        return result;
    }

    private static int pr5(float boxEuro) {
        int result =0;
        result=(int)(boxEuro*1.1f);
        return result;
    }

    private static String pr6(float boxEuro) {
        String result ="0";
        result=String.valueOf(boxEuro*1.1);
        return result;
    }

    private static String pr7(int boxEuro) {
        String result = Integer.toBinaryString(boxEuro);
        return result;
    }

    private static String pr8(String letterChar3) {
        String result="";
        char ch;
        for(int i=0; i<letterChar3.length();i++){
        ch=letterChar3.charAt(i);
        result+=Integer.toBinaryString(ch)+" ";
    }
        return result;
    }

    private static String pr9(int boxEuro) {
        String result = new Character((char)boxEuro).toString();
        return result;
    }
    private static String pr10(int numberInt) {         
        String numberHex = Integer.toHexString(numberInt);
        return numberHex;
    }
    

    private static void p0() {
        
    }

    private static void userMenu() {
        System.out.println("");
        System.out.println("Author:Victor Gómez");
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 4");
        System.out.println("Ejercicio 5");
        System.out.println("Ejercicio 6");
        System.out.println("Ejercicio 7");
        System.out.println("Ejercicio 8");
        System.out.println("Ejercicio 9");
        System.out.println("Ejercicio 10");
        System.out.println("Opción 0- salir");
        System.out.print("\nOpcion ?: ");
    }

    
    
}//FIN DE CLAS
