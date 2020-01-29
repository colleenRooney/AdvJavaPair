package edu.pdx.cs410J.crooney;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class DiamondTest
{

  @Test
  public void canInstantiateDiamondClass()
 {
    new Diamond();
  }

  @Test
  public void makeDiamondWithAReturnsOnlyA() {
      List<String> output = Diamond.makeDiamond('A');
      assertEquals(output.get(0), "A");
      assertEquals(output.size(), 1);
  }

  @Test
  public void hardCodedCapitalC() {
      List<String> output = Diamond.makeDiamond('C');
      assertEquals(output.get(0), "  A  ");
      assertEquals(output.get(1), " B B ");
      assertEquals(output.get(2), "C   C");
      assertEquals(output.get(3), " B B ");
      assertEquals(output.get(4), "  A  ");
  }

  @Test
  public  void makeDiamondWithBReturnsThreeLines() {
    List<String> output = Diamond.makeDiamond('B');
    assertEquals(output.size(), 3);
  }
}
