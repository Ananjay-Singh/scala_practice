package com.ananjay.scala.practice.basic
/*
Key Learning
1. Comparison can be assigned a variables, result can be either true or false
2. == used to compare two variable including string
3. if else can be assigned to variable
4. Pattern match can be assigned to variable
 */
object Condition extends App{
  val mathMarks = 50;
  val englishMarks = 60;
  val subjectOne = "Math"
  val subjectTwo = "Math"
  val isMathMarksGreater = mathMarks > englishMarks;
  val isSubjectNameSame = subjectOne == subjectTwo

  println(s"Is Math Marks Greater than English : $isMathMarksGreater")
  println(s"Is Name of subject one and two same : $isSubjectNameSame")

  if( mathMarks > englishMarks)
    println("Math marks is greater than English")
  else
    println("English marks is greater than Math")

  val isEqual = if(subjectOne == subjectTwo) 1 else 0
  println("isEqual : "+isEqual)

  val isMatch = isEqual match {
    case 0 => "Not Equal"
    case 1 => "Equal"
    case _ => "Throw Exception"
  }
  println("isMatch : "+isMatch)

}