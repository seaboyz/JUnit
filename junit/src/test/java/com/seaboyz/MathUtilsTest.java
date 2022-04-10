package com.seaboyz;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {
  MathUtils mathUtils;

  @BeforeEach
  void init() {
    mathUtils = new MathUtils();
  }

  @Nested
  class Add {
    @Test
    void addPositive() {
      assertEquals(2, mathUtils.add(1, 1), "should return 2");
    }

    @Test
    void addNegtive() {
      assertEquals(-4, mathUtils.add(-1, -3));
    }
  }

  @Test
  @DisplayName("Test Multiplication")
  void multiply() {
    // assertEquals(4, mathUtils.multiply(2, 2));
    assertAll(
        () -> assertEquals(4, mathUtils.multiply(2, 2)),
        () -> assertEquals(0, mathUtils.multiply(2, 0)));
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

  @Test
  @EnabledOnOs(OS.MAC)
  void macos() {
    System.out.println("This is the hello from Mac");
  }

  @Test
  @EnabledOnOs(OS.WINDOWS)
  void windows() {
    System.out.println("This is the hello from Windows");
  }

}
