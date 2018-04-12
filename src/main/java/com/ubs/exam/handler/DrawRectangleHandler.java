package com.ubs.exam.handler;

import java.util.Scanner;

import com.ubs.exam.services.Command;
import com.ubs.exam.services.RectangleCommand;

/**
 *  This is Draw rectangle handler class which take the inputs from command prompt and
 *  create command for it. 
 * @author mayur
 *
 */
public class DrawRectangleHandler implements CommandHandler
{
  public Command toCommandFrom(Scanner scanner)
  {
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();

    return new RectangleCommand(x1, y1, x2, y2);
  }
}
