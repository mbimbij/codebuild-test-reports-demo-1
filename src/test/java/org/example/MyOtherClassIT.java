package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyOtherClassIT {
  @Test
  void testStaticHellop() {
    String response = MyOtherClass.methodp();
    assertThat(response).isEqualTo("hellop");
  }

  @Test
  void testNonStaticHolap() {
    MyOtherClass myClass = new MyOtherClass();
    String response = myClass.holap();
    assertThat(response).isEqualTo("holap");
  }
}