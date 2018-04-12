package com.ubs.exam.handler;

import java.util.HashMap;
import java.util.Map;

import com.ubs.exam.contants.DrawingContants;


/**
 *  This is a Shape factory class.
 * @author mayur
 *
 */
public class ShapeFactory
{
  private final Map<DrawingContants, CommandHandler> handlerMap = new HashMap<DrawingContants, CommandHandler>();

  public ShapeFactory()
  {
    handlerMap.put(DrawingContants.CREATE, new CanvasHandler());
    handlerMap.put(DrawingContants.LINE, new DrawLineHandler());
    handlerMap.put(DrawingContants.RECTANGLE, new DrawRectangleHandler());
    handlerMap.put(DrawingContants.FILL, new FillColorHandler());
    handlerMap.put(DrawingContants.QUIT, new QuitApplication());
    handlerMap.put(DrawingContants.UNKNOWN, new ExceptionHandler());
  }

  public CommandHandler handlerFor(DrawingContants  drawingContants)
  {
    return handlerMap.get(drawingContants);
  }
}
