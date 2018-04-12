package com.ubs.exam.services;

import com.ubs.exam.Shapes.DrawingTool;

public interface Command
{
  void executeOn(DrawingTool drawingTool);
}
