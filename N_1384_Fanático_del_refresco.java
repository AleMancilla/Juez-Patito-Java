/*


Problem D: Fanático del refresco
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 41  Resuelto: 18
[Enviar][Estado][Foro]
Descripción

Juan es fanático del refresco, pero no tiene suficiente dinero para comprar refrescos. La única forma legal que tiene de adquirir más refresco es juntar las botellas vacías y cambiarlas por más refresco. Adicionalmente a las que consume recolecta botellas en la calle.
Entrada

La entrada de datos son tres números e,f,c
con e<1000 que representa el número de botellas vacías que posee, f representa el número de botellas que halló en la calle f<1000. c

representa el número de botellas vacías requeridas para adquirir un refresco. La entrada termina cuando no hay más datos.
Salida

Escriba para cada caso de prueba cuantos refrescos pudo tomar en ese día. Cada número debe imprimirse en una línea.
Ejemplo Entrada

9 0 3 
5 5 2 

	
Ejemplo Salida

4
9


 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1384_Fanático_del_refresco {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int e,c,f;
        
        while(in.hasNext())
        {
          e= in.nextInt();
          f=in.nextInt();
          c=in.nextInt();
          int var=0;
          int aux=0;
          e=e+f;
          while(e>=c)
          {
              e=e+var;
              aux=aux+(e/c);
              f=e/c;
              var=var+( e%c);
              e=f+(var);
              var=0;
              
          }
            System.out.println(aux);
        }
    }
    
}
