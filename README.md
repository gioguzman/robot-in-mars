# test-hackerrank
Este repositorio pretende dar solución a ejercicios de la página Hackerrank presentados en una prueba técnica para una 
empresa.

:construction: Solo se ha construido el algoritmo, no se ha tenido en cuenta las restricciones de cada ejercicio

Los ejercicios son los siguientes:

## Robot en Marte

La NASA nos ha contratado y como empresa llevaremos nuestro primer robot a Marte.

Nuestro robot se mueve 1 metro en cada dirección con el comando Izquierda (L) Derecha (R) Arriba (U) Abajo (D).

La NASA prepara una lista de indicaciones para el movimiento del robot desde la base de carga en el
ejemplo marcada como punto 0.

Sin embargo están preocupados porque en caso de una emergencia el robot pueda regresar a tiempo a la base de carga y 
quieren que evaluemos los planes de movimiento en un simulador, y les digamos la cantidad de instrucciones máximas que 
deberíamos enviar al robot cuando se encuentre en su punto más lejano para que pueda retornar a la base.

Calcule cuál es el número máximo de instrucciones que debería enviarse al robot para que en algún punto del recorrido 
regrese a la base.

> ###Function Description
Complete la función abajo para completar la tarea requerida, la función tendrá una lista de planes a
ejecutar, evalúe cada uno y retorne una lista con el numero máximo de instrucciones

>###Constraints
>```
>len(instruccion) <= 10000
>```

>###Input Format For Custom Testing
>Primero ingresara un entero N definiendo la cantidad de planes que la NASA quiere evaluar, luego
existirán N líneas con las cadenas de instrucciones

>###Sample Case 0
>####Sample Input For Custom Testing
>```
>1
>RUULLLDDDR
>```
>####Sample Output
>```
>4
>```
>####Explanation
> **Ruta:** RUULLLDDDR el robot se moverá como se ve en la imagen
>

|--|--|--|--|--|
|6|5|4|3| |
|7| | |2| |
|8| |0|1| |
|9|10| | ||
| | | | | |

Siguiendo esta ruta, el punto 6 sería el punto más lejano de la base, y necesitaría 4 instrucciones para poder retornar 
a la base, (RDRD o RRDD o DDRR o DRDR).

>###Sample Case 1
>Sample Input For Custom Testing
> ```
> 2
> U
> UUU
> ```
>Sample Output
> ```
> 1
> 3
> ```




