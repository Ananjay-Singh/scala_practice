package com.ananjay.scala.practice.basic
/*
1. Return type is optional
2. Return keyword is optional
3. Last statement is the return value
4. if function has single line then {} is optional
5. Higher Order Function
  a. That take a function as a parameter
	b. Use of higher order function is when you have some input and you wanted to do the different operation based on the function passed in the argument
6. Anonymous Function
	a. Function without name
	b. We can use it when there is no need to call the function multiple time
 */
object Function extends App{

  def squareIt(x:Int):Int={
    return x*x
  }
  def cubeIt(x:Int)=x*x*x
  def transferIt(x:Int, f:Int => Int) = f(x)

  println(s"SquareIt of 2 :${squareIt(2)}")
  println(s"CubeIt of 2 :${cubeIt(2)}")
  println(s"SquareIt of 2 from Higher Order function :${transferIt(3,squareIt)}")
  println(s"CubeIt of 2 from Higher Order function :${transferIt(3,cubeIt)}")
  println(s"SquareIt of 2 from Anonymous function :${transferIt(4,x=>x*x)}")
  println(s"CubeIt of 2 from Anonymous function :${transferIt(4,x=>x*x*x)}")


}