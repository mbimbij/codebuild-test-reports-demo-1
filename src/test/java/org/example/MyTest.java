package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class MyTest {
  @Test
  void name() {
    assertThat(true).isTrue();
  }

  @Test
  void failingTest() {
    fail("failing test");
  }
}
