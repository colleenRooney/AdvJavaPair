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
    System.err.println("Missing command line arguments");
    System.exit(1);
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
      if (rowIndex > nLetters) {
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