package com.ubs.exam.services;

import com.ubs.exam.Shapes.DrawingTool;

public class CreateCommand implements Command
{
  private final int width;
  private final int height;

  public CreateCommand(int w,
                       int h)
  {
    width = w;
    height = h;
  }

  public void executeOn(DrawingTool drawingTool)
  {
    drawingTool.createCanvas(width, height);
  }

  public int getWidth()
  {
    return width;
  }

  public int getHeight()
  {
    return height;
  }
}
