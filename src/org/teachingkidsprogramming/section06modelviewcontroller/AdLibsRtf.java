package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    public String abverb;
    public String edVerb;
    public String bodyPart;
  }
  public static void main(String[] args)
  {
    //  Create a new 'word' container your story's words (uncomment line 10) --#1.1 create a class
    Words word = new Words();
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    word.abverb = MessageBox.askForTextInput("Please enter an adverb: ");
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#3
    word.edVerb = MessageBox.askForTextInput("Please enter a verb with a 'ed' at the end: ");
    //  Ask the user to enter a body part, save it as currentBodyPart --#4
    word.bodyPart = MessageBox.askForTextInput("Please enter a Body part: ");
    //  Connect the words in the currentStory to an RTF file parser (use the Parser object)  --#1.2
    Parser.parseRtfFile("view.rtf", word);
    String currentStory = "Today I woke up " + word.abverb + ". ";
    currentStory = currentStory + "Then I " + word.edVerb + " ";
    currentStory = currentStory + "my " + word.bodyPart + ". ";
    Viewer.displayRtfFile(currentStory);
    //  Display the currentStory in an RTF file (use the Viewer object) --#1.3
  }
}