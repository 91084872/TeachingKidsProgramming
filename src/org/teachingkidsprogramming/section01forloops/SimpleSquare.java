package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setName("Arthur");
    Tortoise.show();
    Tortoise.setSpeed(6);
    int sides = 80;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      int Length = i;
      Tortoise.move(Length);
      Tortoise.turn(360 / 30);
      Tortoise.setPenWidth(i);
    }
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}