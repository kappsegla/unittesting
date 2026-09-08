package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorServiceIT {

    @Test
    void addFiveToNumber_usesRealRandomSource() {
        NumberSource realSource = new RandomNumberSource();
        CalculatorService calculatorService = new CalculatorService(realSource, null);

        var result = calculatorService.addFiveToNumber();

        assertThat(result).isBetween(5, 14);
    }
}
