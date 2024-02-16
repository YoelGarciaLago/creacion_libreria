package com.damLibrerias;

import javax.swing.*;
import java.util.Scanner;

public class Salida {
    /**
     * @param bool permite controlar mejor el flujo
     */
    static boolean bool = true;
    /**
     * @param VENTANA asigna un valor para la opción de ventana
     */
    public final static int VENTANA = 1;
    /**
     * @param CONSOLA asigna un valor para la opción de consola
     */
    public final static int CONSOLA = 2;
    
    /**
     * com.damLibrerias.Salida de un String en una ventana
     * @param msg -string para el mensaje
     */
    public static void salidaMsg (String msg){
        JOptionPane.showMessageDialog(null,msg);
    }
    
    /**
     *
     * @param msg mensaje que quieres imprimir
     * @param output cómo lo quieres imprimir
     * @return el booleano que te muestra si el programa fue utilizado de manera satisfactoria o no
     */
    public static boolean wawa (String msg , Integer output){
        switch (output){
            case VENTANA:
                try{
                    JOptionPane.showMessageDialog(null,msg);
                }
                catch(Exception e){
                    bool = false;
                    break;
                }
                bool = true;
                break;
            case CONSOLA:
                try{
                    System.out.println(msg);
                }
                catch (Exception e){
                    bool = false;
                    break;
                }
                bool = true;
                break;
            default:
             bool = false;
             break;
        }
        return bool;
    }
    
   
    
    
    
    
}

