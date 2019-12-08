/*
 1008: Ordenando mi directorio

Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 108  Resuelto: 39
[Enviar][Estado][Foro]
Descripción

Elly quiere escribir un programa que liste todos los archivos de un directorio dado. Ella ya tiene la lista de todos los archivos.
Ella te proporcionará esta lista en un vector de archivos (Strings). Adicionalmente tendras 2 elementos en el vector: el Actual directorio con el
String (“.”), y el directorio padre con el String (“..”). Estos dos elementos pueden estar en cualquier lugar de los archivos. Sin embargo
Elly quiere que (“.” y “..”) Sean los últimos dos elementos del vector. Entonces Elly tiene algunas reglas para poder mover los dos directorios a las últimas posiciones:
1. Sí “.” y “..” son los 2 últimos elementos del vector (en cualquier orden) el problema está resuelto.
Caso Contrario:
2. Encontrar el primer elemento, ya sea “.” o “..” e intercambiarlo con el último elemento de los archivos.
3. Sí “.” y “..” son ahora los últimos elementos de archivos (cualquier orden) el problema está resuelto
Si no:
4. Buscar el primer elemento, ya sea “.” O “..” e intercambiarlo con el penúltimo elemento de los archivos.
Con estos pasos se garantiza que el problema será resuelto
Entrada

Se te dará un entero T (1<=T<=100) el número de casos de prueba, en la siguiente línea tendrás un entero N (1<=N<=50) el número de elementos en el vector de Strings.
Después vendrán N líneas, el nombre de cada archivo. (Se garantiza que los Strings “.” y “..” estarán en el vector dado y ningún string tendrá espacio entre ellos).
Salida

De acuerdo a cada caso de Prueba imprimir la palabra “Caso: #” donde # debe ser el respectivo número de entrada (1.. T)
Realizando los pasos que Elly te pidió imprimir el vector de Strings, cada string uno en una línea. Entre cada caso de prueba debe existir un espacio en blanco.
Ejemplo Entrada

2
6
ContestApplet.jnlp
.
Image.jpg
Book.pdf
Movie.avi
..
8
No
..
Zaphod
.
Just
Very
very...
Improbable
Ejemplo Salida

Caso 1:
ContestApplet.jnlp
Movie.avi
Image.jpg
Book.pdf
..
.

Caso 2:
No
Improbable
Zaphod
very...
Just
Very
.
..
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1008_Ordenando_mi_directorio {
    
    public static void main(String[] arg)
    {
        Scanner lee = new Scanner(System.in);
        int t = lee.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = lee.nextInt();
            String vec[]= new String[n];
            for (int j = 0; j < n; j++) {
                vec[j] = lee.next();
            }
            //////ordena 
            System.out.println("Caso "+ (i+1)+":");
            ordena(vec);
            ////muestra
            mostrar(vec);
            ///////// 
        }
        
    }
    
    public static String[] ordena(String vec[])
    {
        int tam=vec.length;
        if((vec[tam-1].equals(".")&&vec[tam-2].equals(".."))||(vec[tam-1].equals("..")&&vec[tam-2].equals(".")))
        {
            
            return vec;
        }
        else{
             
            for (int i = 0; i < vec.length; i++) {
                if(vec[i].equals(".")||vec[i].equals(".."))
                {
                    String aux=vec[tam-1];
                    vec[tam-1]=vec[i];
                    vec[i]=aux;
                    break;
                }
            }
            if((vec[tam-1].equals(".")&&vec[tam-2].equals(".."))||(vec[tam-1].equals("..")&&vec[tam-2].equals(".")))
            {
            return vec;
            }
            else{
                for (int i = 0; i < vec.length; i++) {
                if(vec[i].equals(".")||vec[i].equals(".."))
                { 
                    String aux=vec[tam-2];
                    vec[tam-2]=vec[i];
                    vec[i]=aux;
                    
                     break;
                }
            }
                if((vec[tam-1].equals(".")&&vec[tam-2].equals(".."))||(vec[tam-1].equals("..")&&vec[tam-2].equals(".")))
            {
            return vec;
            }
                
            }
        }
        return vec;
    }
    public static void mostrar(String vec[])
    {
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
        System.out.println("");
    }
            
    
}
