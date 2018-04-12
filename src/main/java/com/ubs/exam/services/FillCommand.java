package com.ubs.exam.services;

import com.ubs.exam.Shapes.DrawingTool;

public class FillCommand implements Command
{
  private final int  x;
  private final int  y;
  private final char color;

  public FillCommand(int x,
                     int y,
                     char c)
  {
    this.x = x;
    this.y = y;
    this.color = c;
  }

  public void executeOn(DrawingTool drawingTool)
  {
    drawingTool.fill(x, y, color);
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public char getColor()
  {
    return color;
  }
}
