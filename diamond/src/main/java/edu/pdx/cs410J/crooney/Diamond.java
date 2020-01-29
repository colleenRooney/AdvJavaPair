package edu.pdx.cs410J.crooney;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {
                                                                                    

  public static void main(String[] args) {
    if (args.length > 1) {
      System.err.println("Too many command line arguments");
      System.exit(1);
    }
    else if (args.length < 1) {
      System.err.println("Missing command line argument");
      System.exit(1);
    }
    if (args[0].length() != 1) {
      System.err.println("Input single alphabet character");
      System.exit(1);
    }
    char inputChar = args[0].toCharArray()[0];
    if (inputChar < 'A' || inputChar > 'Z') {
      System.err.println("Input uppercase alphabet character");
      System.exit(1);
    }
    List<String> diamond = makeDiamond(inputChar);
    for (String line : diamond) {
      System.out.println(line);
    }
  }

  public static List<String> makeDiamond(char inputChar) {
    List<String> diamondLines = new ArrayList<>();
    int nLetters = inputChar - 'A';
    int nRows = 2 * nLetters + 1;
    char currentLetter = 'A';
    int left = nLetters;
    int right = left;
    int modifier = 1;

    for (int rowIndex = 0; rowIndex < nRows; rowIndex++) {
      StringBuilder stringBuilder = new StringBuilder();
      for (int charIndex = 0; charIndex < nRows; charIndex++) {
        if ((charIndex == left) || (charIndex == right)) {
          stringBuilder.append(currentLetter);
        }
        else {
          stringBuilder.append(' ');
        }
      }
      if (rowIndex == nLetters) {
          modifier = -1;
      }
      currentLetter += modifier;
      right += modifier;
      left -= modifier;
      diamondLines.add(stringBuilder.toString());
    }
    return diamondLines;
  }
}