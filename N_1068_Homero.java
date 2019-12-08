/*
Problem D: Homero
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 200  Resuelto: 95
[Enviar][Estado][Foro]
Descripción

Este problema esta basado en un capitulo de los Simpsons. Homero esta jugando baseball, para el equipo de la planta nuclear en la que trabaja, su coach es el señor Burns, el cual lo llama para batear. Como muchos deben saber, se utilizan muchas señas para comunicarse y asi no revelarle el secreto a los rivales. El señor Burns le dice a Homero: Simpson, estas son las senales: Si me toco la gorra de esta forma, esa señal es falsa, pero se hace real si me sacudo las manos, Si quiero un toque, me toco la hebilla del cinturon, no una ni dos sino tres veces. En ese momento, Homero se cansa de escuchar las indicaciones del senor Burns y piensa: No se de que me esta hablando, porque no me deja batear y ya. El problema es sencillo, se te pide contar cuantas instrucciones da el senor Burns antes de que Homero se canse de escucharlo y diga porque, (en minusculas).
Entrada

La primera linea tiene el numero de casos (1<=T<=100
). Cada caso comienza con un numero (1<=N<=100) que indica las palabras en el dialogo. Las siguientes N lineas, tienen una palabra en cada una (no hay la necesidad de leer la linea, solo sera una cadena sin espacios). Se garantiza que existira un solo "porque" en cada caso de entrada. Cada palabra tendra como maximo 20

caracteres.
Salida

Por cada caso de entrada, imprimir en una linea el numero de instrucciones que escucha Homero.
Ejemplo Entrada

3 
4 
instruccion1 
instruccion2 
instruccion3 
porque 
3 
instruccion1 
porque 
instruccion2 
2 
porque 
blahblahblah 

	
Ejemplo Salida

3
1
0
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1068_Homero {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
            int x=in.nextInt();
            int cont=0;
            for (int j = 0; j < x; j++) {
                if(in.next().equals("porque"))
                {
                    System.out.println(cont);
                }
                else
                {
                    cont++;
                }
            }
        }
    }
    
}
