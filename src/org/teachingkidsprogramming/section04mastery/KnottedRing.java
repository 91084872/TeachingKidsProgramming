package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class KnottedRing
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    for (int i = 1; i <= 30; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      drawOctagonWithOverLap();
      Tortoise.turn(360 / 30);
      Tortoise.turn(5);
    }
  }
  private static void drawOctagonWithOverLap()
  {
    for (int i = 1; i <= 9; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Pinks.Fuchsia);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Pinks.MediumVioletRed);
    ColorWheel.addColor(PenColors.Reds.OrangeRed);
    ColorWheel.addColor(PenColors.Pinks.DeepPink);
    ColorWheel.addColor(PenColors.Reds.MediumVioletRed);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.OrangeRed);
  }
}
