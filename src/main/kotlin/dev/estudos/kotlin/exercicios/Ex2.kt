package dev.estudos.kotlin.exercicios

import kotlin.math.pow
import kotlin.math.sqrt

/**
2. Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:
D = (R + S) / 2
R = (A + B)²
S = (B + C)²

 **/

fun main(){
	println("""
        Algoritmo para ler três números inteiros e positivos (A, B, C) e
        calcula as expressões:

		D = (R + S) / 2
		Onde:
		R = (A + B)²
		S = (B + C)²
    """.trimIndent())

	val a = readInt("Digite o valor de A");
	val b = readInt("Digite o valor de B");
	val c = readInt("Digite o valor de C");

	println(calcD(a, b, c))
}

fun calcD(a: Int, b: Int, c:Int): Int{
	val aMaisB = (a + b).toDouble()
	val bMaisC = (b + c).toDouble()

	val result = (aMaisB.pow(2) + bMaisC.pow(2))/2

	return result.toInt()
}
