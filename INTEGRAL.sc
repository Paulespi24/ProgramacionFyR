// Descripción:
// Uno de los métodos de integración numérica se denomina como Simpson 1/3. Ese
// método estable lo siguiente:

// 1. Primero definimos la funcion "integracion" la cual recibira como parametros la funcion a integrar,
// el punto inferior a y el punto superior b

def integracion(f: Double => Double, a: Double, b: Double): Double = {
  (b - a) * ((f(a) + 4 * f((a + b) / 2) + f(b)) / 6)
}
// Función para calcular el error
def calcularError(valorEsperado: Double, valorObtenido: Double): Double = {
  math.abs(valorEsperado - valorObtenido)
}

// Ejercicio 1:
// Definición de la función a integrar
val f: Double => Double = x => -(x * x) + 8 * x - 12
// Límites de integración
val a = 3.0
val b = 5.0
// Valor esperado proporcionado en el problema
val valorEsperado = 7.33
// Calcular la integral utilizando el método de Simpson 1/3
val resultado = integracion(f, a, b)
// Calcular el error
val error = calcularError(valorEsperado, resultado)
// Imprimir resultados
println("El resultado de la integración de Simpson 1/3 es: " + resultado)
println("El error en la aproximación es: " + error)
println("//////////////////////////////////////////")


//Ejercicio 2:
// Definición de la función a integrar
val f2: Double => Double = x => 3 * (x * x)
// Nuevos límites de integración
val a2 = 0.0
val b2 = 2.0
// Nuevo valor esperado proporcionado en el problema
val valorEsperado2 = 8.0
// Calcular la integral utilizando el método de Simpson 1/3 con los nuevos parámetros
val resultado2 = integracion(f2, a2, b2)
// Calcular el error
val error2 = calcularError(valorEsperado2, resultado2)
// Imprimir resultados para la nueva integral
println("El resultado de la nueva integración de Simpson 1/3 es: " + resultado2)
println("El error en la aproximación es: " + error2)
println("//////////////////////////////////////////")

//Ejercicio 3:
// Definición de la función a integrar
val f3: Double => Double = x => x + 2 * (x * x) - (x * x * x) + 5 * (x * x * x * x)
// Nuevos límites de integración
val a3 = -1.0
val b3 = 1.0
// Nuevo valor esperado proporcionado en el problema
val valorEsperado3 = 3.333
// Calcular la integral utilizando el método de Simpson 1/3 con los nuevos parámetros
val resultado3 = integracion(f3, a3, b3)
// Calcular el error
val error3 = calcularError(valorEsperado3, resultado3)
// Imprimir resultados para la nueva integral
println("El resultado de la nueva integración de Simpson 1/3 es: " + resultado3)
println("El error en la aproximación es: " + error3)
println("//////////////////////////////////////////")

//Ejercicio 4:
// Definición de la función a integrar
val f4: Double => Double = x => (2 * x + 1) / (x * x + x)
// Nuevos límites de integración
val a4 = 1.0
val b4 = 2.0
// Nuevo valor esperado proporcionado en el problema
val valorEsperado4 = 1.09861
// Calcular la integral utilizando el método de Simpson 1/3 con los nuevos parámetros
val resultado4 = integracion(f4, a4, b4)
// Calcular el error
val error4 = calcularError(valorEsperado4, resultado4)
// Imprimir resultados para la nueva integral
println("El resultado de la nueva integración de Simpson 1/3 es: " + resultado4)
println("El error en la aproximación es: " + error4)
println("//////////////////////////////////////////")

//Ejercicio 5:
// Definición de la función a integrar
val fExponencial: Double => Double = x => math.pow(math.E,x)
// Límites de integración
val aExponencial = 0.0
val bExponencial = 1.0
// Valor esperado proporcionado en el problema
val valorEsperadoExponencial = 1.71828
// Calcular la integral utilizando el método de Simpson 1/3 con los nuevos parámetros
val resultadoExponencial = integracion(fExponencial, aExponencial, bExponencial)
// Calcular el error
val errorExponencial = calcularError(valorEsperadoExponencial, resultadoExponencial)
// Imprimir resultados para la nueva integral
println("El resultado de la integral definida de e^x es: " + resultadoExponencial)
println("El error en la aproximación es: " + errorExponencial)
println("//////////////////////////////////////////")

//Ejercicio 6:
//Import para raiz cuadrada
import scala.math.sqrt
// Definición de la función a integrar
val f6: Double => Double = x => 1.0 / (sqrt(x) - 1)
// Nuevos límites de integración
val a6 = 2.0
val b6 = 3.0
// Nuevo valor esperado proporcionado en el problema
val valorEsperado6 = 0.828427
// Calcular la integral utilizando el método de Simpson 1/3 con los nuevos parámetros
val resultado6 = integracion(f6, a6, b6)
// Calcular el error
val error6 = calcularError(valorEsperado6, resultado6)
// Imprimir resultados para la nueva integral
println("El resultado de la nueva integral definida es: " + resultado6)
println("El error en la aproximación es: " + error6)
println("//////////////////////////////////////////")

//Ejercicio 7:
// Definición de la función a integrar
val f7: Double => Double = x => 1.0 / (1 + x * x)
// Nuevos límites de integración
val a7 = 0.0
val b7 = 1.0
// Nuevo valor esperado proporcionado en el problema
val valorEsperado7 = 0.785398
// Calcular la integral utilizando el método de Simpson 1/3 con los nuevos parámetros
val resultado7 = integracion(f7, a7, b7)
// Calcular el error
val error7 = calcularError(valorEsperado7, resultado7)
// Imprimir resultados para la nueva integral
println("El resultado de la nueva integral definida es: " + resultado7)
println("El error en la aproximación es: " + error7)
println("//////////////////////////////////////////")
