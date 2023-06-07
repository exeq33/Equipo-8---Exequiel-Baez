package com.mycompany.numeroaleatorio;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {
        
        int numeroAleatorio, numeroIntento, control;
        
        Random num = new Random();//calse random
        
        numeroAleatorio = num.nextInt(100); //numeros del 0 al 100
        
        System.out.println("nuemro "+numeroAleatorio);
        
        Scanner entrada =  new Scanner(System.in);
        
        
        
        do{
            System.out.println("Adivina el numero del 0 al 100");
        
            numeroIntento = entrada.nextInt();
            
            if(numeroAleatorio==numeroIntento) {
                System.out.println("Genial le pegaste!!!");
                control = 2;
            }   
            else {
            System.out.println("Que lastima no es ese numero");
            System.out.println("Quieres Intentar otra vez? 1 = SI --- 2 =NO");
            control = entrada.nextInt();
        }
        }while(control==1);
    
    }
        
    
}
