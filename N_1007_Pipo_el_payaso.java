/*              /////// TIEMPO EXEDIDOOOOO ////////
Descripción
Pipo es un payaso que esta ayudando en una fiesta de cumpleaños, en este momento esta organizando un concurso para poder regalar premios.
El concurso trata de seleccionar un grupo de personas, cada una de ellas tiene que decir un trabalenguas.
Para que una frase sea considerada trabalenguas se necesita que la mayoria de palabras tengan un prefijo comun (al menos el primer caracter en comun).
A continuacion un ejemplo del concurso
Persona 1: tres tristes tigres tragan trigo en un trigal
Persona 2: pedro picapiedra pone piedras
Ahora Pipo elije al ganador con las siguientes reglas:
                                       • Cuenta cuantas palabras dijo la persona con un prefijo comun.
                                       • El ganador la persona que dijo mas palabras con la anterior caracteristica.
                                       • Si hay un empate Pipo elije a la persona que mas antes participo.
El concurso era tan divertido que vinieron personas de todo tipo poetas, docentes, abogados, raperos y hasta politicos, como se sabe ellos haban mucho, ahora Pipo esta perdido y necesita tu ayuda.

Entrada
La entrada consiste en un numero T (1<=T<=10) casos de prueba, seguido por T casos de prueba, cada caso de prueba consiste en un numero N (1<=N<=100) numero de participantes, por cada participante se le dara una linea que contiene el trabalenguas del participante.

Salida

Por cada caso de prueba imprimir el numero de participante ganador (ver el ejemplo de la salida).

Ejemplo Entrada

2 
2 
tres tristes tigres tragan trigo en un trigal 
pedro picapiedra pone piedras 
3 
pepe puede comer camarones picantes 
pablito clavo un clavito sobre la cabeza de un calvito 
prometo prometo prometo prometo prometo prometo prometo prometo 

	
Ejemplo Salida

El ganador es 1
El ganador es 3

 */
package juez.patito;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL-PC
 */
public class N_1007_Pipo_el_payaso {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int n2 = in.nextInt();
            in.nextLine();
            int max = Integer.MIN_VALUE;
            int ganador = 0;
            for (int j = 1; j <= n2; j++) {
                String pal = in.nextLine();
                int x =cantidadderimas(pal);//cantidad de rimas
                
                if (x>max)
                {
                    max = x;
                    ganador = j;
                }
            }
                System.out.println("El ganador es "+ganador);
            
        }
    }

    private static int cantidadderimas(String pal) {
        
        
        int n = pal.length();
        char ini = pal.charAt(0);
        int j = contarpalabras(pal); 
        char vec []=new char[j];
        vec[0]=ini;
        int cant=1;
        for (int i = 1; i < n; i++) {
            char x = pal.charAt(i);
            char var = pal.charAt(i-1);
            if(var == ' ')
            {
                vec[cant]=x;
                cant++;
            }
        }
        Arrays.sort(vec);
        
        cant = metodoconteo(vec);
        return cant;
    }

    private static int contarpalabras(String pal) {
        
    int cant = 1;
        for (int i = 1; i < pal.length(); i++) {
            char x = pal.charAt(i);
            if( x == ' ')
            {
                cant++;
            }
    }
        return cant;
    }

    private static int metodoconteo(char[] vec) {
        int cant = 0;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                if(vec[i]==vec[j])
                {
                    cant++;
                }
            }
            if(cant>max)
            {
                max=cant;
            }
                cant=0;
        }
        return max;
    }
    
}
