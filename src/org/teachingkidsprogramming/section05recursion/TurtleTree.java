package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    Tortoise.setBackground(Color.black);
    int length = 60;
    drawBranch(length);
  }
  private static void drawBranch(int length)
  {
    if (length > 0)
    {
      adjustColor(length);
      Tortoise.move(length);
      drawLowerBranches(length);
    }
  }
  private static void adjustColor(Object length)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(30, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    colors.put(60, PenColors.Browns.SaddleBrown);
    //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
    Tortoise.setPenColor(colors.get(length));
  }
  private static void drawLowerBranches(int length)
  {
    Tortoise.turn(30);
    drawShorterBranch(length);
    Tortoise.turn(-60);
    drawShorterBranch(length);
    Tortoise.turn(30);
    Tortoise.move(-1 * length);
  }
  private static void drawShorterBranch(int length)
  {
    drawBranch(length - 10);
  }
}