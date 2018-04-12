package com.ubs.exam.command;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ubs.exam.contants.DrawingContants;

public class ConsoleCommandTest
{

  @Test
  public void testCommandParsing()
  {
    assertEquals(DrawingContants.CREATE, DrawingContants.parse("C"));
    assertEquals(DrawingContants.LINE, DrawingContants.parse("L"));
    assertEquals(DrawingContants.RECTANGLE, DrawingContants.parse("R"));
    assertEquals(DrawingContants.FILL, DrawingContants.parse("B"));
    assertEquals(DrawingContants.QUIT, DrawingContants.parse("Q"));
    assertEquals(DrawingContants.UNKNOWN, DrawingContants.parse("D"));
  }
}
