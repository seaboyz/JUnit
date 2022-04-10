package com.seaboyz;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
  @Test
  void testAdd() {
    MathUtils mathUtils = new MathUtils();
    assertEquals(2, mathUtils.add(1, 1), "The add method should add two numbers");
  }

  @Test
  void testMultiply() {
    MathUtils mathUtils = new MathUtils();
    assertEquals(4, mathUtils.multiply(2, 2), "The multiply mehod should multiply two numbers");
  }

  @Test
  void testComputeCircleArea() {
    MathUtils mathUtils = new MathUtils();
    int r = anyInt();
    assertEquals(Math.PI * r * r, mathUtils.computeCircleArea(r));
  }

  @Test
  void testDivideThrowExceptionWhenPassZeroAsDemoninator() {
    MathUtils mathUtils = new MathUtils();
    assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
  }
}
