package org.teachingkidsprogramming.section09final;

import org.teachingextensions.logo.Tortoise;

public class RectangleKata
{
  public static void main(String[] args)
  {
    //    Draw a rectangle
    //    Write the steps to code your rectangle out in English 
    //          I need to make the tortise move 20 pixels and move to the right 10 pixels then do a for-a-loop 4 times
    for (int i = 0; i <= 4; i++)
    {
      Tortoise.move(20);
      Tortoise.turn(90);
      Tortoise.move(10);
      Tortoise.move(90);
    }
    //    Translate from English to Java one line at a time
    //    Run your code after each line of Java to make sure it works as expected
    //    XTRA CREDIT: After your code is working, re-factor to remove duplication
  }
}
