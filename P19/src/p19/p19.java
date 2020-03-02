package p19;

import java.util.Scanner;
public class p19 {

    static String [] arrayNombreEquipos;
    static int [] arrayPuntos, arrayGoles, arrayGolesR, arrayEquipos;
    static int golesMAnotados = 0, golesMRec=0, puntosM=0, diferencia=0;
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        int option = -1;
        do{
        userMenu();
        option = keyboard.nextInt();
        switch(option){
            case 1:
                System.out.print("Cuantos equipos hay?: ");
                int equiposNum = keyboard.nextInt();
                arrayEquipos = new int [equiposNum];
                arrayNombreEquipos = new String [equiposNum];
                arrayGolesR = new int [equiposNum];
                arrayGoles = new int [equiposNum];
                arrayPuntos = new int [equiposNum];
                for(int i=0 ; i<arrayEquipos.length ; i++){
                    System.out.print("Cual es el nombre del equipo?: ");
                    arrayNombreEquipos[i] = keyboard.next();
                    System.out.print("Cuantos goles ha recibido?: ");
                    arrayGolesR[i] = keyboard.nextInt();
                    System.out.print("Cuantos goles ha anotado?: ");
                    arrayGoles[i] = keyboard.nextInt();
                    System.out.print("Cuantos puntos tiene el equipo?: ");
                    arrayPuntos[i] = keyboard.nextInt();
                    golesMAnotados += arrayGoles[i];
                    golesMRec += arrayGolesR[i];
                    puntosM += arrayPuntos[i];
                }
                break;
            case 2:
                int maxVal = 0;
                int maxPosicion = 0;
                for(int i=0 ; i<arrayPuntos.length ; i++){
                    if(arrayPuntos[i]>maxVal){
                        maxVal=arrayPuntos[i];
                        maxPosicion = i;
                    }
                }
                System.out.println(arrayNombreEquipos[maxPosicion] + " ha marcado " + arrayGoles[maxPosicion] + " goles");
                System.out.println(arrayNombreEquipos[maxPosicion] + " ha recibido " + arrayGolesR[maxPosicion] + " goles");
                System.out.println(arrayNombreEquipos[maxPosicion] + " tiene un total de " + arrayPuntos[maxPosicion] + " puntos");
                break;
            case 3:
                maxVal = 0;
                maxPosicion = 0;
                for(int i=0 ; i<arrayPuntos.length ; i++){
                    if(arrayPuntos[i]>maxVal){
                        maxVal=arrayPuntos[i];
                        maxPosicion = i; 
                    }
                }
                System.out.println(arrayNombreEquipos[maxPosicion+1] + " ha marcado " + arrayGoles[maxPosicion+1] + " goles");
                System.out.println(arrayNombreEquipos[maxPosicion+1] + " ha recibido " + arrayGolesR[maxPosicion+1] + " goles");
                System.out.println(arrayNombreEquipos[maxPosicion+1] + " tiene un total de " + arrayPuntos[maxPosicion+1] + " puntos");
                break;
            case 4:
                int minVal = 0;
                int minPosicion = 0;
                for(int i=0 ; i<arrayGolesR.length ; i++){
                    if(arrayGolesR[i]<minVal){
                        minVal=arrayGolesR[i];
                        minPosicion = i;
                    }
                }
                System.out.println(arrayNombreEquipos[minPosicion] + " ha marcado " + arrayGoles[minPosicion] + " goles");
                System.out.println(arrayNombreEquipos[minPosicion] + " ha recibido " + arrayGolesR[minPosicion] + " goles");
                System.out.println(arrayNombreEquipos[minPosicion] + " tiene un total de " + arrayPuntos[minPosicion] + " puntos");
                break;
            case 5: 
                int maxGoals = 0;
                maxPosicion = 0;
                for(int i=0 ; i<arrayGoles.length ; i++){
                    if(arrayGoles[i]>maxGoals){
                        maxGoals=arrayGoles[i];
                        maxPosicion = i;
                    }
                }
                System.out.println(arrayNombreEquipos[maxPosicion] + " ha marcado " + arrayGoles[maxPosicion] + " goles");
                System.out.println(arrayNombreEquipos[maxPosicion] + " ha recibido " + arrayGolesR[maxPosicion] + " goles");
                System.out.println(arrayNombreEquipos[maxPosicion] + " tiene un total de " + arrayPuntos[maxPosicion] + " puntos");
                break;
            case 6:
                golesMAnotados = golesMAnotados/arrayEquipos.length;
                golesMRec = golesMRec/arrayEquipos.length;
                System.out.println("La media de goles marcados es: " + golesMAnotados);
                System.out.println("La media de goles recibidos es: " + golesMRec);
                break;
            case 7:
                int minPuntos = 0;
                minPosicion = 0;
                for(int i=0 ; i<arrayPuntos.length ; i++){
                    if(arrayPuntos[i]<minPuntos){
                        minPuntos=arrayPuntos[i];
                        minPosicion = i;
                    }
                }
                System.out.println("El equipo que desciende es " + arrayNombreEquipos[minPosicion] + " ,con un total de " + arrayPuntos[minPosicion] + " puntos");
                break;
            case 8:
                for(int i=0 ; i<arrayEquipos.length ; i++){
                    System.out.println(arrayNombreEquipos[i] + " ha marcado " + arrayGoles[i] + " goles");
                    System.out.println(arrayNombreEquipos[i] + " ha recibido " + arrayGolesR[i] + " goles");
                    System.out.println(arrayNombreEquipos[i] + " tiene un total de " + arrayPuntos[i] + " puntos");
                }
                break;
            case 9:
                for(int i=0 ; i<arrayEquipos.length ; i++){
                    diferencia=arrayGoles[i] - arrayGolesR[i];
                    System.out.println(arrayNombreEquipos[i] + " tiene una diferencia de " + diferencia + " goles");
                }
                break;
            case 10: p10();
                break;
            default: System.out.println("Opción no valida");
        }
        }while(option !=10);  
    }
    
    private static void userMenu() {
        System.out.println("");
        System.out.println("Author: Victor Gomez");
        System.out.println("Opción 1 - (Goles): ");
        System.out.println("Opción 2 - (Campeón): ");
        System.out.println("Opción 3 - (Subcampeón): ");
        System.out.println("Opción 4 - (Mejor equipo defensivo): ");
        System.out.println("Opción 5 - (Mejor equipo ofensivo): ");
        System.out.println("Opción 6 - (Media de goles): ");
        System.out.println("Opción 7 - (Descienden): ");
        System.out.println("Opción 8 - (Visualizar datos): ");
        System.out.println("Opción 9 - (Diferencia de goles): ");
        System.out.println("Opción 10 - (Salir): ");
        System.out.print("\nOpción?: ");
    }
    
    private static void p10 (){
        System.out.print("Are you sure you want to exit?(Yes/No): ");
        String answer = keyboard.next();
        if(answer.equals("Yes")){
            System.out.println("Thanks for using this programm. Goodbye!");
        }
    }
    }
 
