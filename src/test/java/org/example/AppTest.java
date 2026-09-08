package org.example;

import org.junit.jupiter.api.DisplayName;import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void test() {
        boolean result = true;
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Names method should return list of names containing Jane 😊")
    void listOfNames() {
        var result = App.names();
        assertThat(result)
                .hasSizeGreaterThan(1)
                .contains("Jane");
    }
}
