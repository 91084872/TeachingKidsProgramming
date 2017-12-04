package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    makeSpeedyTurtle();
    //  makeSlowTurtle (recipe below) --#4.0
    makeSlowTurtle();
    //  ------------- End of makeSlowTurtle --#3.1
    //  makeCrazyTurtle (recipe below) --#6.0
    //  ------------- Recipe for makeCrazyTurtle --#5.1
    //        Create a new crazyTurtle instance  
    //        Add your crazyTurtle to your MultiTurtleWindow
    //        Have your crazyTurtle draw a 55 pixel long lightning bolt
    //  ------------- End of makeCrazyTurtle --#5.2
  }
  private void makeSlowTurtle()
  {
    Turtle slowTurtle = new Turtle();
    mtw.addAndShowTurtle(slowTurtle);
    slowTurtle.drawTriangle(-50);
  }
  private void makeSpeedyTurtle()
  {
    Turtle speedyTurtles = new Turtle();
    mtw.addAndShowTurtle(speedyTurtles);
    speedyTurtles.setSpeed(10);
    speedyTurtles.drawTriangle(100);
  }
}
