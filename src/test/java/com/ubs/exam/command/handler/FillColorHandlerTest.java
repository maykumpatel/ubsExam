package com.ubs.exam.command.handler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.ubs.exam.handler.FillColorHandler;
import com.ubs.exam.services.Command;
import com.ubs.exam.services.FillCommand;

public class FillColorHandlerTest
{
  private FillColorHandler fillColorHandlerTest;

  @Before
  public void init()
  {
	  fillColorHandlerTest = new FillColorHandler();
  }

  @Test
  public void testFillConsoleCommandHandler()
  {
    byte[] data = "6 8 o".getBytes();
    InputStream input = new ByteArrayInputStream(data);
    Scanner scanner = new Scanner(input);
    Command command = fillColorHandlerTest.toCommandFrom(scanner);

    assertTrue(command.getClass().isAssignableFrom(FillCommand.class));

    FillCommand fillCommand = (FillCommand) command;

    assertEquals(6, fillCommand.getX());
    assertEquals(8, fillCommand.getY());
    assertEquals('o', fillCommand.getColor());
  }
}
