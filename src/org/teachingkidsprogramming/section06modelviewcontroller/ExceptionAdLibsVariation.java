package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionAdLibsVariation
{
  public static void main(String[] args)
  {
    String adverb = askAdVerb();
    String edVerb = askEdVerb();
    String bodyPart = askForBodyPartPls();
  }
  private static String askForBodyPartPls()
  {
    String bodyPart = MessageBox.askForTextInput("Enter a body part pls");
    if (bodyPart.isEmpty())
    {
      MessageBox.askForTextInput("U don't like body parts?! U should!");
      askForBodyPartPls();
    }
    else if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("A number 1= Body part?");
      askForBodyPartPls();
    }
    return bodyPart;
  }
  private static String askEdVerb()
  {
    String edVerb = MessageBox.askForTextInput("Enter a verb with an'ed'at the end: ");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Don't like verbs?");
      askEdVerb();
    }
    else if (edVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Don't like Strings?");
      askEdVerb();
    }
    return edVerb;
  }
  private static String askAdVerb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Y U don't want to play?!");
      askAdVerb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Follow DIRECTIONS, Ricky!");
      askAdVerb();
    }
    return adverb;
  }//end of the method
}//end of the class
