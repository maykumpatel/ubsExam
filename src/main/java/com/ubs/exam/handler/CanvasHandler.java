package com.ubs.exam.handler;

import java.util.Scanner;

import com.ubs.exam.services.Command;
import com.ubs.exam.services.CreateCommand;

/**
 *  This is canvas handler class which take the inputs from command prompt and
 *  create command for it.
 * @author mayur
 *
 */

public class CanvasHandler implements CommandHandler
{
  public Command toCommandFrom(Scanner scanner)
  {
    int width = scanner.nextInt();
    int height = scanner.nextInt();

    return new CreateCommand(width, height);
  }
}
