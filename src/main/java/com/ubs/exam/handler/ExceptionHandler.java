package com.ubs.exam.handler;

import java.util.Scanner;

import com.ubs.exam.services.Command;

/**
 * This is exception handler if inputs are not match with require parameter.
 * @author mayur
 *
 */
public class ExceptionHandler implements CommandHandler
{
  public Command toCommandFrom(Scanner scanner)
  {
    scanner.nextLine();
    throw new IllegalArgumentException("Unsupported command");
  }
}
