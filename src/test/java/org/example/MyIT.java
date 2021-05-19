package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyIT {
  @Test
  void integrationTest() {
    assertThat(true).isTrue();
  }
}
