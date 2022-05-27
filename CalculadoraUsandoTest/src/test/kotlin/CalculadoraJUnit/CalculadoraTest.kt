package CalculadoraJUnit

import CalculadoraJUnit.Calculadora
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class CalculadoraTest{

    @Test
    fun somTest(){
        assertEquals(10.0, Calculadora.som(5.0, 5.0))
    }

    @Test
    fun subTest(){
        assertEquals(15.0, Calculadora.sub(30.0, 15.0))
    }

    @Test
    fun multTest(){
        assertEquals(25.0, Calculadora.mult(5.0, 5.0))
    }

    @Test
    fun divTest(){
        assertEquals(50.0, Calculadora.div(100.0, 2.0))
    }

    @Test
    fun potTest(){
        assertEquals(125.0, Calculadora.pot(5.0, 3.0))
    }

    @Test
    fun eleTest(){
        assertEquals(3.0, Calculadora.ele(9.0))
    }

}