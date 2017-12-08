package org.teachingkidsprogramming.section08events;

import java.util.Random;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  ProgramWindow programWindow;
  public SimpleBubble()
  {
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    prepareColorPalette();
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Blues.LightSteelBlue);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //     createBubble (recipe below) --#8.1
    createBubble();
    //     ------------- Recipe for createBubble --#8.2
    //     Remove previous bubbles from your program window --#9
    programWindow.clearWindow();
    Random random = new Random();
    int radius = random.nextInt(41 + 10);
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    circle.setCenter(x, y);
    circle.addTo(programWindow);
    //    ------------- End of createBubble recipe --#8.3
  }
  public static void createBubble()
  {
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
  public static void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Blues.LightSteelBlue);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
  }
}