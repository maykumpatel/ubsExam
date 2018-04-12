package com.ubs.exam.entry;

import java.util.Scanner;

import com.ubs.exam.Shapes.DrawingTool;
import com.ubs.exam.contants.DrawingContants;
import com.ubs.exam.handler.ShapeFactory;
import com.ubs.exam.services.Command;


/**
 *  This is entry point of console drawing tool.
 * @author mayur
 *
 */
public class ConsoleDrawingTool
{
  private final static ShapeFactory handlerFactory = new ShapeFactory();

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    DrawingTool drawingTool = new DrawingTool();
    DrawingContants consoleCommand = DrawingContants.UNKNOWN;

    do {
      System.out.print("enter command:");
      try {
        consoleCommand = DrawingContants.parse(scanner.next());
        Command command = handlerFactory.handlerFor(consoleCommand).toCommandFrom(scanner);
        command.executeOn(drawingTool);

        drawingTool.draw(System.out);
      }
      catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
    while (consoleCommand != DrawingContants.QUIT);

    scanner.close();
    System.exit(0);
  }
}
