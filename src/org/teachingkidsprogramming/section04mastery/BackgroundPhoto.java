package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Yellows;

public class BackgroundPhoto
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    //  Set the current picture to this url "https://usatftw.files.wordpress.com/2017/05/spongebob.jpg?w=1000&h=600&crop=1" --#1.0
    String currPicture = "https://usatftw.files.wordpress.com/2017/05/spongebob.jpg?w=1000&h=600&crop=1";
    //  Set the background image to the current picture--#1.1
    Tortoise.getBackgroundWindow().setBackgroundImage(currPicture);
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setSpeed(10);
    int side = 2;
    //  Do the following 75 times --#7.1
    for (int i = 1; i <= 75; i++)
    {
      Tortoise.setPenColor(Yellows.Yellow);
      Tortoise.setPenDown();
      side++;
      Tortoise.move(side);
      Tortoise.setX(555);
      Tortoise.setY(65);
      Tortoise.turn(360 / 3);
      Tortoise.turn(1);
    }
  }
}
