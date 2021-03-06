package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses2
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Arthur");
    Tortoise.show();
    Tortoise.setSpeed(6);
    Tortoise.setX(200);
    int Height = 40;
    drawHouse(Height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int Height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.setPenWidth(4);
    Tortoise.move(Height);
    //drawFlatRoof();
    drawTrapezoidRoof();
    Tortoise.move(Height + 4);
    Tortoise.turn(-90);
    Tortoise.move(50);
    Tortoise.turn(-90);
  }
  private static void drawTrapezoidRoof()
  {
    Tortoise.turn(30);
    Tortoise.move(15);
    Tortoise.turn(60);
    Tortoise.move(15);
    Tortoise.turn(50);
    Tortoise.move(15);
    Tortoise.turn(40);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
