package com.ananjay.scala.practice.basic

object Loop extends App{
  println("******* Table for 2 *********")
  for(i <- 1 to 10){
    println(s"2 X $i = ${2*i}")
  }

  println("***** Factorial Programme *****")
  var num = 5;
  var res = 1
  while(num > 0){
    res*=num
    num-=1
  }
  println("Factorial of 5 : "+ res)

  println("**** Sum of the digit Programme ****")
  var sum = 0
  do{
    sum+=res%10
    res/=10
  }while(res>0)
  println("Sum of the digit :"+sum)
}