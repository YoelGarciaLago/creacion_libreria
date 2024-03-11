package com.damLibrerias;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada implements Interfaz {
    /**
     * Método para escoger por pantalla dos float's
     * @return lista[] con los dos valores que escogiste
     */
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
    /**
     * Método para escoger por pantalla dos double's
     * @return lista[] con los dos valores que escogiste
     */
    public static double[] elegirNúmerosDouble(){
        Scanner sc = new Scanner(System.in);
        double [] lista = new double[2];
        
        try{
            System.out.println("Elige el 1er nº");
            lista[0] = sc.nextDouble();
            System.out.println("Elige el 2do nº");
            lista[1] = sc.nextDouble();
        } catch (NumberFormatException e) {
            System.out.println("Pusiste mal un nº :/");
            return null;
        } catch (InputMismatchException e){
            System.out.println("Pusiste algo mal :/");
            return null;
            
        }
        return lista;
        
    }
    
    @Override
    public void elegirOpcion(int opc, String msg) {
    
    }
}

