package edu.pdx.cs410J.crooney;

import org.junit.Test;

import java.util.List;

public class DiamondTest
{

  @Test
  public void canInstantiateDiamondClass() {
    new Diamond();
  }

  @Test
  public void makeDiamondWithAReturnsOnlyA() {
      List<String> output = Diamond.makeDiamond('A');
      assert(output.get(0).equals("A"));
      assert(output.size() == 1);
  }

  @Test
  public void hardCodedCapitalC() {
      List<String> output = Diamond.makeDiamond('C');
      assert(output.get(0).equals("  A  "));
      assert(output.get(1).equals(" B B "));
      assert(output.get(2).equals("C   C"));
      assert(output.get(3).equals(" B B "));
      assert(output.get(4).equals("  A  "));
  }

  @Test
  public  void makeDiamondWithBReturnsThreeLines() {
    List<String> output = Diamond.makeDiamond('B');
    assert(output.size() == 3);
  }
}
