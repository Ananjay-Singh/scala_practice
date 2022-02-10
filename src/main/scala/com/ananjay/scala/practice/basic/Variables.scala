package com.ananjay.scala.practice.basic
/*
Key Learning :
  1. Not possible of reassignment to val
  2. Var variable can be changed
  3. We need not to be write the type explicitly It can be inferred by the compiler
  4. Variable, Class, Object, Function name should be in CamelCase
  5. We need to give f at the end of the Float type variable
  6. We need to give l at the end of the Long type variable
 */
object Variables extends App{
  var a = 5
  println("Var Int : " +a)
  val b = 10
  println("Val Int : " +b)
  val c : String = "Hello"
  println("String : " +c)
  val d: Boolean = true
  println("Boolean : " +d)
  val e: Char = 'a'
  println("Char : " +e)
  val f: Double = 3.14
  println("Double : " +f)
  val g: Float = 5.534f
  println("Float : " +g)
  val h: Long = 23233223233454554l
  println("Long : " +h)
  val i: Byte = 123
  println("Byte : " +i)
  println("Combined Result : "+ a + b + c + d + e + f + g + h + i)
}