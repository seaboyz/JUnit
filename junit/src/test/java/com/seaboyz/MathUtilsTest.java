package com.seaboyz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
  @Test
  void test() {
    MathUtils mathUtils = new MathUtils();
    assertEquals(mathUtils.add(1, 1), 2, "The add method should add two numbers");
  }
}
