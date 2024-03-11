package com.damLibrerias;

public class Calc {
    /**
     *
     * @param n1 1er núm a sumar
     * @param n2 2do núm a sumar
     * @return resultado de la operación
     */
    public static float suma (float n1, float n2){
        float resultado = n1+n2;
        return resultado;
    }
    /**
     *
     * @param n1 1er núm a sumar
     * @param n2 2do núm a sumar
     * @return resultado de la operación
     */
    public static float resta (float n1, float n2){
        float resultado = n1 - n2;
        return resultado;
    }
    /**
     *
     * @param n1 1er núm a sumar
     * @param n2 2do núm a sumar
     * @return resultado de la operación
     */
    public static float multiplicacion (float n1, float n2){
        float resultado = n1 * n2;
        return resultado;
    }
    /**
     *
     * @param n1 1er núm a sumar
     * @param n2 2do núm a sumar
     * @return resultado de la operación
     */
    public static float division (float n1, float n2){
        float resultado = n1 / n2;
        return resultado;
    }
    
    /**
     *
     * @param n1 nº radical (el que se mete dentro de la raíz)
     * @param n2 nº índice (el que está fuera de la raíz (por ej. en la raíz cuadrada sería el 2)
     * @return resultado de la operacion
     */
    public static double raizCuadrada(double n1, double n2){
        double resultado = Math.pow(n1, 1.0/n2);
        return resultado;
    }
    /**
     * @param SUMA asignacion de esta operación al número 1
     */
    public static final int SUMA = 1;
    /**
     * @param RESTA asignacion de esta operación al número 2
     */
    public static final int RESTA = 2;
    /**
     * @param MULTIPLICACION asignacion de esta operación al número 3
     */
    public static final int MULTIPLICACION = 3;
    /**
     * @param DIVISION asignacion de esta operación al número 4
     */
    public static final int DIVISION = 4;
    /**
     * @param RAICES asignación de esta operación al nº 5
     */
    public static final int  RAICES = 5;
    
    /**
     *
     * @param n1 1er valor a operar
     * @param n2 2do valor a operar
     * @param opcion cómo quieres operar esos números
     * @return resultado de la operacion
     */
    public static  float Calc (float n1, float n2, Integer opcion){
        /**
         * @param resultado valor por defecto
         */
        float resultado = 0.f;
        switch (opcion){
            case SUMA:
                resultado = Calc.suma(n1,n2);
                break;
            case RESTA:
                resultado = Calc.resta(n1,n2);
                break;
            case MULTIPLICACION:
                resultado = Calc.multiplicacion(n1,n2);
                break;
            
            case DIVISION:
                resultado = Calc.division(n1, n2);
                break;
            case RAICES:
                resultado = (float)Calc.raizCuadrada(n1,n2);
                break;
            default:
                System.out.println("No salió la operación esperada");
            
        }
        return resultado;
    }
}
