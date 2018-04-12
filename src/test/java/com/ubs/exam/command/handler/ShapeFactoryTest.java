package com.ubs.exam.command.handler;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.ubs.exam.contants.DrawingContants;
import com.ubs.exam.handler.ShapeFactory;

public class ShapeFactoryTest
{
  private ShapeFactory shapeFactory;

  @Before
  public void init()
  {
    shapeFactory = new ShapeFactory();
  }

  @Test
  public void testConsoleCommandHandlers()
  {
    for (DrawingContants command : DrawingContants.values()) {
      assertNotNull(shapeFactory.handlerFor(command));
    }
  }
}
