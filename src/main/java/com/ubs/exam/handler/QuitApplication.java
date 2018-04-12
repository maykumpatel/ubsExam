package com.ubs.exam.handler;

import java.util.Scanner;

import com.ubs.exam.services.Command;
import com.ubs.exam.services.QuitCommand;

/**
 * 
 * @author mayur
 *
 */
public class QuitApplication implements CommandHandler
{
  public Command toCommandFrom(Scanner scanner)
  {
    return new QuitCommand();
  }
}
