# test-hackerrank
Este repositorio pretende dar solución a ejercicios de la página Hackerrank presentados en una prueba técnica para una 
empresa.

>:construction: Solo se ha construido el algoritmo, no se ha tenido en cuenta las restricciones de cada ejercicio

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

### Function Description
 
Complete la función abajo para completar la tarea requerida, la función tendrá una lista de planes a
ejecutar, evalúe cada uno y retorne una lista con el numero máximo de instrucciones

### Constraints
```
len(instruccion) <= 10000
```

### Input Format For Custom Testing
Primero ingresara un entero N definiendo la cantidad de planes que la NASA quiere evaluar, luego
existirán N líneas con las cadenas de instrucciones

### Sample Case 0
**Sample Input For Custom Testing**
```
1
RUULLLDDDR
```
**Sample Output**
```
4
```
**Explanation**

 **Ruta:** RUULLLDDDR el robot se moverá como se ve en la imagen


|   |     |   |   |   |
|---|-----|---|---|---|
| 6 | 5   | 4 | 3 |   |
| 7 |     |   | 2 |   |
| 8 |     | 0 | 1 |   |
| 9 | 10  |   |   |   |

Siguiendo esta ruta, el punto 6 sería el punto más lejano de la base, y necesitaría 4 instrucciones para poder retornar 
a la base, (RDRD o RRDD o DDRR o DRDR).

### Sample Case 1
**Sample Input For Custom Testing**
 ```
 2
 U
 UUU
 ```
**Sample Output**
 ```
 1
 3
 ```

## El programador perfeccionista

Ricardo es miembro de nuestro equipo, y aunque suele ser muy productivo, sufre de un impulso que le lleva a perfeccionar
y reescribir una parte del trabajo que hace cada día.

Cada día es capaz de escribir F cantidad de funciones nuevas, pero su impulso lo lleva el mismo día a borrar R cantidad 
de las funciones, y así cada día, increíblemente cuando termina su trabajo no vuelve a refactorizar ninguna función, 
sino que envía el pull request a review.

Todos aman el trabajo de Ricardo, pero el arquitecto del equipo está preocupado por el deadline(fecha de entrega) de 
las historias que le asigna a Ricardo, y te pide ayuda con un programa que determine si Ricardo podrá cumplir con su 
asignación.

Para ello el arquitecto te entregará un numero D correspondiente al número de días del deadline de entrega T la 
cantidad de funciones totales que espera el cliente que realice Ricardo F la cantidad de funciones nuevas que escribirá 
Ricardo por día, R la cantidad de funciones que borrará Ricardo cada día al finalizar su trabajo.

Calcule si Ricardo puede o no cumplir con las tareas asignadas.

 ```
true       Lo logrará
false      No lo logrará
 ```

La plantilla convertirá el true en 1 y false en 0 automáticamente

### Function Description

Complete la función, que recibirá un arreglo de casos a evaluar por el arquitecto. Cada caso se compondrá de la 
siguiente manera

* caso[i][0] (D) Número de días para el deadline
* caso[i][1] (T) Número de funciones esperadas por el cliente al finalizar el deadline
* caso[i][2] (F) Número de funciones nuevas que puede escribir Ricardo en un día
* caso[i][3] (R) Número de funciones que borrará Ricardo al finalizar el día

### Constraints
 ```
0 < D <= 10000
1 <= T <= 5000
1 <= F <= 5000
F <= R <= 5000
 ```

### Input Format For Custom Testing

El caso comienza con un numero N que representa el numero de posibilidades que el arquitecto del equipo quiere evaluar.

Luego una línea con el numero 4 que representa las 4 variables a leer 

Posteriormente vienen N Líneas cada una con 4 variables de la siguiente forma

 ```
D T F R
 ```

### Sample Case 0
**Sample Input For Custom Testing**
 ```
1
4
5 110 30 10
 ```
**Sample Output**
 ```
1
 ```

**Explanation**

El cliente espera en 5 días que Ricardo escriba 110 funciones, Ricardo podrá escribir 30 funciones, pero finalizando 
el día borrará 10 de las funciones escritas.

Cada día Ricardo escribirá 25 funciones, pero borrará 5, al finalizar el día 4 Ricardo tendrá 80 funciones en código, 
como el día 5 podría escribir 30 funciones nuevas terminaría su trabajo y enviaría el pull request sin borrar ninguna
función, Ricardo cumpliría con el deadline.
 ```
Dia      Total Funciones
Dia 1    20
Dia 2    40
Dia 3    80
Dia 4    60
Dia 5    110
 ```

### Sample Case 1
**Sample Input For Custom Testing**
 ```
1
4
2 40 20 5
5 110 30 10
 ```

**Sample Output**
 ```
0
1
 ```
**Explanation** 

En este caso Ricardo no lograría cumplir su cometido, ya que el día 2 tendrá a lo sumo 35 funciones escritas de las 40 
requeridas por el cliente.