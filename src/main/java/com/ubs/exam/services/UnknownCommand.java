package com.ubs.exam.services;

import com.ubs.exam.Shapes.DrawingTool;

public class UnknownCommand implements Command
{
  public void executeOn(DrawingTool drawingTool)
  {
    // noop
  }
}
