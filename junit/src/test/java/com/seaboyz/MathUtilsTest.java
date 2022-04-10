package com.seaboyz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
  @Test
  void test() {
    MathUtils mathUtils = new MathUtils();
    assertEquals(mathUtils.add(1, 1), 2, "The add method should add two numbers");
  }

  @Test
  void testMultiply() {
    MathUtils mathUtils = new MathUtils();
    assertEquals(mathUtils.multiply(2, 2), 4, "The multiply mehod should multiply two numbers");
  }
}
