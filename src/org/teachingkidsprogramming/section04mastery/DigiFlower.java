package org.teachingkidsprogramming.section04mastery;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(9);
    Tortoise.getBackgroundWindow().setBackground(Grays.Silver);
    Tortoise.setPenWidth(3);
    createColorPalette();
    for (int i = 1; i <= 15; i++)
    {
      drawOctogon();
      Tortoise.turn(360 / 15);
    }
  }
  private static void drawOctogon()
  {
    for (int i = 1; i <= 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    Color color1 = PenColors.Reds.Red;
    Color color2 = PenColors.Oranges.DarkOrange;
    Color color3 = PenColors.Yellows.Gold;
    Color color4 = PenColors.Yellows.Yellow;
    ColorWheel.addColor(color1);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color1);
  }
}
