package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyTest {
  @Test
  void unitTest1() {
    assertThat(true).isTrue();
  }

  @Test
  void unitTest2() {
    assertThat(true).isTrue();
//    assertThat(true).isFalse();
  }
}
