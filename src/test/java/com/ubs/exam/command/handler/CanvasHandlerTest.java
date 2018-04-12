package com.ubs.exam.command.handler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.ubs.exam.handler.CanvasHandler;
import com.ubs.exam.services.Command;
import com.ubs.exam.services.CreateCommand;


public class CanvasHandlerTest
{
  private CanvasHandler canvasHandlerTest;

  @Before
  public void init()
  {
	  canvasHandlerTest = new CanvasHandler();
  }

  @Test
  public void testCreateConsoleCommandHandler()
  {
    byte[] data = "20 6".getBytes();
    InputStream input = new ByteArrayInputStream(data);
    Scanner scanner = new Scanner(input);
    Command command = canvasHandlerTest.toCommandFrom(scanner);

    assertTrue(command.getClass().isAssignableFrom(CreateCommand.class));

    CreateCommand createCommand = (CreateCommand) command;

    assertEquals(20, createCommand.getWidth());
    assertEquals(6, createCommand.getHeight());
  }
}
