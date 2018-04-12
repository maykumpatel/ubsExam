package com.ubs.exam.contants;

/**
 *  This enum has all shapes declare in this class.
 * @author mayur
 *
 */
public enum DrawingContants
{
  CREATE("C"),
  LINE("L"),
  RECTANGLE("R"),
  FILL("B"),
  QUIT("Q"),
  UNKNOWN("U");

  private final String c;

  private DrawingContants(String c)
  {
    this.c = c;
  }

  private String getCommandCharacter()
  {
    return c;
  }

  public static DrawingContants parse(String c)
  {
    for (DrawingContants command : values()) {
      if (command.getCommandCharacter().equals(c)) {
        return command;
      }
    }
    return UNKNOWN;
  }
}
