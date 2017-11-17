package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizGrader;

public class TreeQuiz extends TreeQuizAdapter
{
  public void questions1To4()
  {
    doubleLength();
    decreaseTurn();
    setNinety();
    //   Question 4 
    //   angleFive (recipe below) 
    //   ------------- Recipe for angleFive 
    angleFive();
    //       sets the 5th angle to 36 degrees
    //   ------------- End of angleFive recipe
  }
  private void angleFive()
  {
    Tortoise.setAngle(angles.putIfAbsent(turn, 36), 5);
  }
  private void setNinety()
  {
    Tortoise.setAngle(angles.put(turn, 90));
  }
  private void decreaseTurn()
  {
    turn = turn - 1;
  }
  private void doubleLength()
  {
    length = length * 2;
  }
  public static void main(String[] args)
  {
    new TreeQuizGrader().grade(new TreeQuiz());
  }
}
