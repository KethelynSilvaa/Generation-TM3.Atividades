package CalculadoraJUnit

import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

        companion object{

            fun som(n1: Double, n2: Double): Double {
                return n1 + n2

            }

            fun sub(n1: Double, n2: Double): Double {
                return n1 - n2
            }

            fun mult(n1: Double, n2: Double): Double{
                return n1 * n2
            }

            fun div (n1: Double, n2: Double): Double{
                return n1 / n2

            }
            fun pot(n1:Double, n2:Double): Double{
                return n1.pow(n2)
            }

            fun ele(n1:Double):Double{
                return sqrt(n1)
            }

        }

    }
