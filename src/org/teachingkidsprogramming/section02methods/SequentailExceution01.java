package org.teachingkidsprogramming.section02methods;

public class SequentailExceution01
{
  static int counter = 1;
  // looking at sequential execution,
  // the order operations run in a program
  public static void main(String[] args)
  {
    System.out.println("In main #1");
    myMethod1();
    System.out.println("in main #2");
  } //end method
  public static void myMethod1()
  {
    System.out.println("In main #2");
    myMethod2();
  }
  public static void myMethod2()
  {
    System.out.println("In myMethod2 #1");
    if (counter < 10)
    {
      counter++;
      myMethod3();
    }
  }
  public static void myMethod3()
  {
    System.out.println("In myMethod3 #2");
    myMethod2();
  }
} // end of class
