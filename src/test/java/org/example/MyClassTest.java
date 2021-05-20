package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyClassTest {
  @Test
  void testStaticHello() {
    String response = MyClass.method();
    assertThat(response).isEqualTo("hello");
  }

  @Test
  void testNonStaticHola() {
    MyClass myClass = new MyClass();
    String response = myClass.hola();
    assertThat(response).isEqualTo("hola");
  }
}