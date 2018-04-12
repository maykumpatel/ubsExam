package com.ubs.exam.handler;

import java.util.Scanner;

import com.ubs.exam.services.Command;

public interface CommandHandler
{
  Command toCommandFrom(Scanner scanner);
}
