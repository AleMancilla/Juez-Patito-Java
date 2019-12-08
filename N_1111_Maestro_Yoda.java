/*


Problem A: Maestro Yoda
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 222  Resuelto: 62
[Enviar][Estado][Foro]
Descripción

Yoda, fue Gran Maestro de la Orden Jedi y uno de los miembros más importantes del Alto Consejo Jedi 
en los últimos días de la República Galáctica, tenia la agilidad y fuerza increiblemente increible. 
Saltando y girando en el aire derrotaba a sus oponentes. Estas peculiares habilidades se los 
representara con s = salto, g = giro, d=defensa, a= ataca, f = fuerza. Luke aprendio todas las tecnicas que Yoda le enseño, para ello Luke tuvo que entrenar n veces, lo que se quiere averiguar es, cuantas veces fallo?, Luke fallo cada vez que empleaba una habilidad desconocida (patear, voltearse,....etc) y cada vez que empleaba tres veces seguidas una determinada habilidad que Yoda le enseñaba.

Entrada

La entrada consiste en un numero n (n >=1 y n <= 1000000), el cual representa los n entrenamientos que tuvo Luke, seguida de n cadenas(cadena de longitud no mayor a 1000000), el cual representa el entrenamiento
Salida

La salida consta de un numero el cual representa cuantos entrenamiento fallo Luke.
Ejemplo Entrada

5 
ssdafggasdagdasdfsgafds  
agsdffffsgdaaaasdfsaddd 
aasgfddsgpcags 
asdfggfddfsgaffdsa 
asgfdasddfgsadfgsfsdagtre 

	
Ejemplo Salida

3 



 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1111_Maestro_Yoda {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String x;
        int aux =0;
        for (int i = 0; i < n; i++) {
            x=in.next();
            int c=0;
            for (int j = 0; j < x.length(); j++) {
                if((x.charAt(j)!='a')&&(x.charAt(j)!='g')&&(x.charAt(j)!='d')&&(x.charAt(j)!='s')&&(x.charAt(j)!='f'))     
                {
                    c++;
                    //System.out.println("-->"+x.charAt(j));
                    break;
                }
                if(j>2 && ((x.charAt(j)==x.charAt(j-1))&&(x.charAt(j-2)==x.charAt(j))))
                {
                     c++;
                    //System.out.println("-->"+x.charAt(j));
                    break;
                }
            }
            if(c!=0)
                aux++;
            c=0;
        }
        System.out.println(aux);
    }
    
}
