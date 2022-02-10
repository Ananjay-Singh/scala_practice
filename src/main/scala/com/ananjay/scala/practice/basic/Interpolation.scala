package com.ananjay.scala.practice.basic
/*
Key Learning :
  1. String Interpolation - for replacement of defined variables or expressions in a given String with values.
    a. Define variables in that String with $variable_name syntax
    b. Define expressions in that String with ${expression} syntax
    c. Define Object fields with ${object.field} syntax
  2. Type of Interpolation
    a. s String Interpolator
      - to get the string value of variable in print statement
    b. f String Interpolator
      - to get the formatting the value of variable in print statement
      - .2%f used to print 2 precision value
      - %04d used to make value of 4 digit by adding zero at start
    c. raw String Interpolator
      - to print string without formatting
      - \n and \t will be printed as is
  3. Print " and '
    a. """ use in Interpolation to print " or '
    b. Single quote(') can be written inside double quote(")
  4. Print new line and \
    a. \n used to print new line,
    b. \\ used to print one single \
 */
object Interpolation extends App{
  val age :Byte = 27
  val name :String = "Ananjay"
  val weight :Float = 63.5f
  val isGraduate :Boolean = true
  val mathMarks :Byte = 84;
  val englishMarks :Byte = 67;
  println(s"'Name' : $name \n'Age' : $age \n'Weight' : $weight \n'Graduate' : $isGraduate")
  println(s"""'Total "Marks"' : ${englishMarks + mathMarks}""")
  println(f"Average Marks : ${(englishMarks + mathMarks)/2.toFloat}%.2f")
  println(f"Formatting : $mathMarks%05d")
  println(raw"Raw \n \t Interpolation: $mathMarks")

}