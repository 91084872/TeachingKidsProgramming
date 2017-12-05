package org.teachingkidsprogramming.section07objects;

import java.util.ArrayList;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class CloneTurtles
{
  // Uncomment the two lines of code below to create a container and a window for your turtles --#1
  public ArrayList<Turtle> turtles = new ArrayList<Turtle>();
  public MultiTurtleWindow mtw     = new MultiTurtleWindow();
  public CloneTurtles()
  {
    showSomeTurtles();
  }
  private void showSomeTurtles()
  {
    for (int i = 0; i < 3; i++)
    {
      Turtle arthursTurtle = new Turtle();
      turtles.add(arthursTurtle);
    }
    int numberOfTurtles = turtles.size();
    //System.out.println("There are " + numberOfTurtles + " turtles. ");
    new Text("There are " + numberOfTurtles + " turtles in the turtle container").setTopLeft(50, 50)
        .setPenColor(PenColors.Yellows.Gold).addTo(mtw);
    for (Turtle arthursTurtle : turtles)
    {
      mtw.addAndShowTurtle(arthursTurtle);
    }
    for (int i = 0; i < 3; i++)
    {
      turtles.get(i).setX(i * 100 + 350);
      turtles.get(i).setY(i * 100 + 100);
    }
    for (Turtle arthursTurtle : turtles)
    {
      arthursTurtle.setPenWidth(10);
      arthursTurtle.setSpeed(9);
      arthursTurtle.drawStar(100);
    }
  }
  //
  public static void main(String[] args)
  {
    new CloneTurtles();
  }
}
