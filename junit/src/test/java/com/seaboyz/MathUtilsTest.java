package com.seaboyz;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {
  MathUtils mathUtils;

  @BeforeAll
  static void BeforeAllInit() {
    System.out.println("This is the hello from @beforeAll");
  }

  @BeforeEach
  void init() {
    System.out.println("This is the hello from @beforeEach");
    mathUtils = new MathUtils();
  }

  @Test
  void testAdd() {
    assertEquals(2, mathUtils.add(1, 1), "The add method should add two numbers");
  }

  @Test
  void testMultiply() {
    assertEquals(4, mathUtils.multiply(2, 2), "The multiply mehod should multiply two numbers");
  }

  @Test
  void testComputeCircleArea() {
    int r = anyInt();
    assertEquals(Math.PI * r * r, mathUtils.computeCircleArea(r));
  }

  @Test
  void testDivideThrowExceptionWhenPassZeroAsDemoninator() {
    assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
  }
}
