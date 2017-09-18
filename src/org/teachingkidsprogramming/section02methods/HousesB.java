package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class HousesB
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouseFlatRoof(height);
    drawHousePointyRoof(200);
    drawHouseFlatRoof(120);
    drawHousePointyRoof(90);
    drawHousePointyRoof(50);
    drawHouseFlatRoof(90);
    drawHousePointyRoof(70);
    drawHouseFlatRoof(20);
    drawHousePointyRoof(100);
    drawHouseSlantedRoof(50);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.move(height);
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(135);
    Tortoise.move(15);
    Tortoise.turn(-45);
    Tortoise.move(height);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
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
  private static void drawPointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
}
