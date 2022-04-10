package com.seaboyz;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
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
  @DisplayName("Testing add() method")
  void add() {
    assertEquals(2, mathUtils.add(1, 1), "should return 2");
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
  @DisplayName("It should fail when the deniminator is 0")
  void divide() {
    assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
  }

  @Disabled
  @Test
  @DisplayName("Calculate the number to the power of 2")
  void square() {
    assertEquals(4, mathUtils.square(2));
  }

}
