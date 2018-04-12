package com.ubs.exam.command.handler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.ubs.exam.handler.DrawRectangleHandler;
import com.ubs.exam.services.Command;
import com.ubs.exam.services.RectangleCommand;

public class DrawRectangleHandlerTest
{
  private DrawRectangleHandler drawRectangleHandlerTest;

  @Before
  public void init()
  {
    drawRectangleHandlerTest = new DrawRectangleHandler();
  }

  @Test
  public void testFillConsoleCommandHandler()
  {
    byte[] data = "2 3 7 8".getBytes();
    InputStream input = new ByteArrayInputStream(data);
    Scanner scanner = new Scanner(input);
    Command command = drawRectangleHandlerTest.toCommandFrom(scanner);

    assertTrue(command.getClass().isAssignableFrom(RectangleCommand.class));

    RectangleCommand rectangleCommand = (RectangleCommand) command;

    assertEquals(2, rectangleCommand.getX1());
    assertEquals(3, rectangleCommand.getY1());
    assertEquals(7, rectangleCommand.getX2());
    assertEquals(8, rectangleCommand.getY2());
  }
}
