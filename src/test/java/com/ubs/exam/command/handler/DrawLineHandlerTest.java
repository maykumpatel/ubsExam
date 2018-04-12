package com.ubs.exam.command.handler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.ubs.exam.handler.DrawLineHandler;
import com.ubs.exam.services.Command;
import com.ubs.exam.services.LineCommand;

public class DrawLineHandlerTest
{
  private DrawLineHandler drawLineHandlerTest;

  @Before
  public void init()
  {
    drawLineHandlerTest = new DrawLineHandler();
  }

  @Test
  public void testFillConsoleCommandHandler()
  {
    byte[] data = "2 6 2 10".getBytes();
    InputStream input = new ByteArrayInputStream(data);
    Scanner scanner = new Scanner(input);
    Command command = drawLineHandlerTest.toCommandFrom(scanner);

    assertTrue(command.getClass().isAssignableFrom(LineCommand.class));

    LineCommand lineCommand = (LineCommand) command;

    assertEquals(2, lineCommand.getX1());
    assertEquals(6, lineCommand.getY1());
    assertEquals(2, lineCommand.getX2());
    assertEquals(10, lineCommand.getY2());
  }
}
