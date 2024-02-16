/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ipc1_tarea2_202300710;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author JoséSandoval
 */
public class IPC1_Tarea2_202300710 {

    static Scanner scan = new Scanner(System.in);
    static DecimalFormat dos_decimales = new DecimalFormat("#.##");
    
    public static void calcular(){
        System.out.println("");
        System.out.println("Ingrese los números a operar:");
        double x, y;
        System.out.println("Ingrese el primer número");
        x = scan.nextDouble();
        System.out.println("Ingrese el segundo número");
        y = scan.nextDouble();
        System.out.println("");
        System.out.println("Elija la operación a ejecutar:\n1. Multiplicación\n2. División\n3. Suma\n4. resta");
        
        boolean activador = true;
        while(activador == true){
            int valor = (int) scan.nextDouble();
            if(valor > 0 && valor <5){
                switch(valor){
                    case 1:
                        System.out.println("");
                        System.out.println("El resultado es: " + dos_decimales.format(x*y));
                        activador = false;
                        break;
                    case 2:
                        if( y== 0){
                            System.out.println("");
                            System.out.println("Syntax Error");
                            System.out.println("");
                            System.out.println("¿Quiere hacer otro cálculo?(s/n)");
                            boolean activador2 = true;
                            while(activador2 == true){
                                String respuesta = scan.nextLine();
                                if(respuesta.length() == 1 && (respuesta.toLowerCase().equals("s") || respuesta.toLowerCase().equals("n"))){
                                    if(respuesta.equals("s")){
                                        activador2 = false;
                                        calcular();
                                    }else{
                                        activador2 = false;
                                        System.out.println("Ten un buen día :)");
                                        System.exit(0);
                                    }
                                }
                            }
                        }else{
                            System.out.println("");
                            System.out.println("El resultado es: " + dos_decimales.format(x/y));
                        }
                        activador = false;
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("El resultado es: " + dos_decimales.format(x+y));;
                        activador = false;
                        break;
                    case 4:
                        System.out.println("");
                        System.out.println("El resultado es: " + dos_decimales.format(x-y));;
                        activador = false;
                        break;
                }
            }
        }
        System.out.println("");
        System.out.println("¿Quiere hacer otro cálculo?(s/n)");
        boolean activador3 = true;
        while(activador3 == true){
            String respuesta = scan.nextLine();
            if(respuesta.length() == 1 && (respuesta.toLowerCase().equals("s") || respuesta.toLowerCase().equals("n"))){
                if(respuesta.equals("s")){
                    activador3 = false;
                    calcular();
                }else{
                    activador3 = false;
                    System.out.println("Ten un buen día :)");
                    System.exit(0);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        calcular();
    }
}
