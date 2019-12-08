/*
Problem B: Maximo Comun Divisor 2
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 222  Resuelto: 134
[Enviar][Estado][Foro]
Descripción
 Dados dos números enteros a,b te piden hallar el máximo común divisor entre a y b.

Recordemos que el máximo común divisor es el número más grande que divide a ambos números.
Por ejemplo mcd(48,60) es 12. Veamos que 48  es divisible por 2,3,4,8,6,12 y el numero 60 es divisible por 2,3,4,5,6,10,12,15,20,30. El número más grande que divide a ambos es el 12. 
por esto decimos que mcd(48,60)=12.
Si ya resolvio el anterior ejercicio de MCD y envio su solucion a este se dara cuenta que ahora recibe TLE, esto es por que los limites son mucho mayores, se recomienda usar el Algoritmo de Euclides, que indica que el mcd(a,b)=mcd(b,a%b).
Entrada
La primera línea contiene el numero n de casos de prueba. Luego siguen n lineas cada una con un caso de prueba. Cada caso de prueba contiene dos números enteros a y b separados por un espacio. 2≤a,b≤109

Salida
Escriba en una linea el máximo común divisor entre a y b.

Ejemplo Entrada
2
48 60
42 56
Ejemplo Salida
12
14
*/
package juez.patito;

/**
 *
 * @author Alejandro
 */
public class N_1262_Maximo_Comun_Divisor_2 {
    
    
}
