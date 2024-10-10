# Condicion de carrera

## ¿Qué es una condición de carrera?

Una condición de carrera es un comportamiento no deseado que se produce en un sistema cuando dos o más procesos intentan modificar un recurso compartido al mismo tiempo.

## ¿Qué es un recurso compartido?

Un recurso compartido es un recurso que puede ser accedido por varios procesos al mismo tiempo.

## Ejemplo de condición de carrera

En este ejemplo se muestra como cuatro hilos inentan
acceder a una variable compartida al mismo tiempo.
Mientras que la variable contador valga menos de 400  los hilos
iran sumando 1 a la variable contador.
