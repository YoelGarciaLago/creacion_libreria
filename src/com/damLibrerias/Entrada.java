package com.damLibrerias;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static float[] elegirNúmeros(){
        Scanner sc = new Scanner(System.in);
        float [] lista = new float[2];
        
        try{
            System.out.println("Elige el 1er nº");
            lista[0] = sc.nextFloat();
            System.out.println("Elige el 2do nº");
            lista[1] = sc.nextFloat();
        } catch (NumberFormatException e) {
            System.out.println("Pusiste mal un nº :/");
            return null;
        } catch (InputMismatchException e){
            System.out.println("Pusiste algo mal :/");
            return null;
            
            }
        return lista;
    
}
    }

