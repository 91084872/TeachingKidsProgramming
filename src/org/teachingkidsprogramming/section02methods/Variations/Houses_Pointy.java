package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class Houses_Pointy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int Height = 40;
    drawHouseFlatRoof(Height);
    drawHouseFlatRoof(120);
    drawHouseFlatRoof(90);
    drawHouseFlatRoof(20);
    drawHousePointyRoof(Height);
    drawHousePointyRoof(120);
    drawHousePointyRoof(90);
    drawHousePointyRoof(20);
    drawHouseTrapezoidRoof(Height);
    drawHouseTrapezoidRoof(120);
    drawHouseTrapezoidRoof(90);
    drawHouseTrapezoidRoof(20);
  }
  private static void drawHouseFlatRoof(int Height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.setPenWidth(3);
    Tortoise.move(Height);
    drawFlatRoof();
    Tortoise.move(Height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseTrapezoidRoof(int Height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.setPenWidth(3);
    Tortoise.move(Height);
    drawTrapezoidRoof();
    Tortoise.move(Height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int Height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.setPenWidth(3);
    Tortoise.move(Height);
    drawPointyRoof();
    Tortoise.move(Height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
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
  private static void drawPointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
}
