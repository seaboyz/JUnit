package com.seaboyz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
  @Test
  void test() {
    MathUtils mathUtils = new MathUtils();
    assertEquals(2,mathUtils.add(1, 1) "The add method should add two numbers");
  }

  @Test
  void testMultiply() {
    MathUtils mathUtils = new MathUtils();
    assertEquals(4, mathUtils.multiply(2, 2), "The multiply mehod should multiply two numbers");
  }

  @Test
  void testComputeCircleArea() {
    MathUtils mathUtils = new MathUtils();
    assertEquals(Math.PI * 2 * 2, mathUtils.computeCircleArea(2));
  }
}
