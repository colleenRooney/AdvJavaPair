package edu.pdx.cs410J.crooney;

import org.junit.Test;

public class DiamondTest
{

  @Test
  public void canInstantiateDiamondClass() {
    new Diamond();
  }

  @Test
  public void makeDiamondWithAReturnsA() {
      String output = Diamond.makeDiamond('A');
      assert(output == "A");
  }
}
