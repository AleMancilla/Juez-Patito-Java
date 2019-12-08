/*
 Descripcon
Cada empleado de una burocracia tiene una descripción de trabajo.
La descripcion del trabajo del empleado, combinado con otros factores, tales como
antigüedad, se utiliza para determinar su salario.
El sistema de Puntos libera a los Recursos Humanos departamento de tener que hacer un juicio inteligente sobre el valor del empleado.
La descripción del trabajo no hace más que analizar en busca de palabras y frases que indican la responsabilidad.
En particular, las descripciones de puestos de control que indican sobre un amplio presupuesto o de gestión de un gran número de personas dió altas puntuaciones.
Usted tiene que implementar un sistema de puntos simplificado. Se le dará un diccionario de descripciones de puestos. Cada descripción de trabajo son para calcular el salario asociado con el trabajo, de acuerdo con el sistema.
Entrada
La primera línea de entrada contiene 2 enteros positivos: m ≤ 1000, el número de palabras en el diccionario, y n ≤ 100, el número de descripciones de puestos. m líneas siguen; cada una contiene una palabra (una cadena de hasta 16 letras minúsculas) y un valor en dólares (un número real entre 0 y 1000000). Seguidamente
al diccionario son los n descripciones de trabajo. Cada descripción de trabajo consiste en una o más líneas de texto; para su comodidad, el texto se ha convertido a minúsculas y no tiene caracteres que no sean letras, números y espacios. Cada descripción de trabajo es terminada por una línea que contiene un punto.
Salida
Para cada descripción de trabajo, la salida del salario correspondiente calcula como la suma de los valores de puntos para todas las palabras que aparecen en la descripción. Las palabras que no aparecen en el diccionario tienen un valor '0'.

Ejemplo Entrada
7 2
administrar 100000
gasto 200000
ejercer 50000
responsabilidad 25000
experiencia 100
habilidad 50
dinero 75000
el titular deberá administrar el gasto de dinero de la leche jardín de infantes
y ejercer la responsabilidad de hacer el cambio que él o ella va a compartir
la responsabilidad de la tarea de administrar el dinero de su auxiliar
cuya habilidad y experiencia deberán garantizar el ejercicio del gasto éxito
.
este individuo debe tener la habilidad para llevar a cabo un trasplante de corazón y experiencia 
en la ciencia de cohetes
.
Ejemplo Salida
850150
150
Ayuda
 Introducir las palabras del diccionarion a un vector. Luego verificar si


alguna palabra en la descripcion se encuentra en el diccionarion si es asi

sumar el valor de la palabra en el diccionario.


 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1096_Puntos {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int x = in.nextInt();
    String []vec= new String [n];
    int []vecnum= new int [n];
    for(int i=0; i<n ; i++)
    {
        vec[i]= in.next();
        
        vecnum[i]= in.nextInt();
    }
      in.nextLine();  
    String pal = in.nextLine();
    
        System.out.println(pal);
    String palaux = "";
    int num =0;
    for(int i=0; i<pal.length();i++)
    {
        char dig=pal.charAt(i);
        //System.err.println(dig);
        if(dig=='.')
        {
            System.out.println(num);
           num=0; 
        }
        else
        {
        if(dig==' ')
        {
            palaux="";
        }
        else
        {
            palaux+=dig;
            
        //System.out.println(palaux);
            for(int j=0; j<n; j++)
            {
                if(vec[j].equals(palaux))
                {
                    num=num +vecnum[j];
                }
                
            }
        }
        }
    }
    
    }
}
