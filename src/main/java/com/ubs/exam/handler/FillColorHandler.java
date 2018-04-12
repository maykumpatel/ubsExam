package com.ubs.exam.handler;

import java.util.Scanner;

import com.ubs.exam.services.Command;
import com.ubs.exam.services.FillCommand;

/**
 *  This is fill color handler class which take the inputs from command prompt and
 *  create command for it.
 * @author mayur
 *
 */
public class FillColorHandler implements CommandHandler
{
  public Command toCommandFrom(Scanner scanner)
  {
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    char color = scanner.next().charAt(0);

    return new FillCommand(x, y, color);
  }
}
