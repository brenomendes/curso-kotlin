package dev.estudos.kotlin.exercicios

import kotlin.math.pow
import kotlin.math.sqrt


fun main(){
	val p1 = Ponto(x1, x2)
	val p2 = Ponto(y1, y2)


	calculaDistancia(p1,p2)
}

class Ponto(val x: Int, val y: Int)

fun calculaDistancia(p1: Ponto, p2: Ponto): Int {

	val x2MenosX1 = (p2.x - p1.x).toDouble();
	val y2MenosY1 = (p2.y - p1.y).toDouble();

	val valor: Double = x2MenosX1.pow(2) + y2MenosY1.pow(2)

	val result = sqrt(valor);

	return result.toInt()
}
