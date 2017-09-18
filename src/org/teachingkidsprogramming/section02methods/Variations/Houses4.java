package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class Houses4
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
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
    Tortoise.setPenWidth(3);
    Tortoise.move(Height);
    //  Tortoise.turn(90);
    //Tortoise.move(30);
    //Tortoise.turn(90)
    drawSlantedRoof();
    Tortoise.move(Height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawSlantedRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(135);
    Tortoise.move(15);
    Tortoise.turn(-45);
  }
}
