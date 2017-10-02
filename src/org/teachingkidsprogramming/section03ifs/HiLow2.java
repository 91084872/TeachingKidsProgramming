package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow2
{
  public static void main(String[] args)
  {
    //int answer = 11;
    int number;
    number = MessageBox.askForNumericalInput("How many guesses do you need?");
    int answer = (int) (Math.random() * 100 + 1);
    for (int i = 1; i <= number; i++)
    {
      int guess = MessageBox.askForNumericalInput("what is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!!!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too High");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
      if (i == number)
      {
        MessageBox.showMessage("You Lost");
      }
    }
  }
}
