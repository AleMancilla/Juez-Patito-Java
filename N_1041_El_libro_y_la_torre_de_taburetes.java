/*
Problem A: El libro y la torre de taburetes
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 93  Resuelto: 36
[Enviar][Estado][Foro]
Descripción

¿Recuerdas el problema del libro y la torre humana?

3 amigos, entran a una biblioteca distinta, y quieren alcanzar un libro. Esta vez, se dan cuenta que hay n

taburetes iguales en la biblioteca, y en vez de hacer una torre humana para alcanzar al libro, deciden apilar los taburetes uno sobre otro para alcanzarlo.

Los amigos han decidido que nunca más harán una torre humana, porque es muy doloroso. La última vez que lo intentaron, el amigo de más abajo se resvaló, y todos calleron de una forma muy bochornosa (además, sus cuellos aún siguen adoloridos). Así que, para alcanzar el libro, sólamente podrán apilar los taburetes uno tras otro, y enviar a uno de los amigos para que coja el libro.

Recuerda que un amigo puede alcanzar un libro, si y solo si, este se encuentra debajo de la coronilla de su cabeza, y arriba de la planta de sus piés.

Ninguno de los 3 amigos puede saltar, ni cojer un libro que se encuentre por debajo de la planta de sus piés o por encima de la coronilla de su cabeza.

Además, los amigos pueden alcanzar un libro, si y solo si, se encuentran parados en la parte superior de un taburete, o parados en el piso.
Entrada

Se te dará un número entero 0≤n≤102

que indica la cantidad de casos de prueba.

    A continuación, y por cada caso de prueba, se te darán dos líneas:
    En la primera línea, habrán 3 números números:
        El primer número, es un número entero 0≤n≤103

, que indica la cantidad de taburetes que hay en la biblioteca.
El segundo número 0≤x≤10
(no necesariamente entero) indica la altura que tienen todos los taburetes de la biblioteca.
Y el tercer número 0≤h≤106

    , indica a qué altura se encuentra el libro del piso.

En la siguiente línea, se te darán 3 números (no necesariamente enteros): 1≤a,b,c≤10

    , indicando la altura de cada uno de los tres amigos.

Salida

Debes imprimir una carita triste ``:(

'' si los amigos no pueden alcanzar el libro. Pero si los amigos pueden alcanzar el libro, imprime la menor cantidad de taburetes que necesitan apilar.
Ejemplo Entrada

3 
10 1 15  
1 2 5 
3 100 7 
3 5 1 
10 1 6  
1 2 5 

	
Ejemplo Salida

10
:(
1

 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1041_El_libro_y_la_torre_de_taburetes {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) 
        {
            int cantidad = in.nextInt();
            double altura = in.nextDouble();
            int aquealtura = in.nextInt();
            
            double may=0;
            for (int j = 0; j < 3; j++) {
                double x = in.nextDouble();
                if(x>may)
                    may=x;
            }
            int total=0;
            double base=0;
            int aux=0;
            ///////////////////////////
            if (aquealtura>=base && aquealtura<may)
            {
                aux++;
                System.out.println(total);
            }
            else
            {
                for (int j = 0; j < cantidad; j++)
                {
                    
                    base+=altura;
                    total++;
                    if (aquealtura>=base && aquealtura<=(base+may))
                    {
                        aux++;
                        System.out.println(total);
                        break;
                    }
                    
                }
                if(aux==0)
                    System.out.println(":(");
            }
        }
    }
            
            
    
}
