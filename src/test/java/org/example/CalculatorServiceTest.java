package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.*;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorServiceTest {

    @Test
    void addFiveToFiveShouldReturnTen() {
        //Arrange
        NumberSource stub = () -> 5;  //Test Double, "mock" object
        CalculatorService service = new CalculatorService(stub, null);
        //Act
        var result = service.addFiveToNumber();
        //Assert
        assertThat(result).isEqualTo(10);
    }


    @Test
    void greetingGoodMorning() {
        NumberSource ignore = () -> 0;
        Clock fixedClock = Clock.fixed(
                LocalDateTime.of(2024, 1, 1, 11, 59).toInstant(ZoneOffset.UTC),
                ZoneOffset.UTC
        );

        CalculatorService service = new CalculatorService(ignore, fixedClock);
        var result = service.greeting();
        assertThat(result).isEqualTo("Good morning");
    }

    @Test
    void greetingGoodAfternoon() {
        NumberSource ignore = () -> 0;
        Clock fixedClock = Clock.fixed(
                LocalDateTime.of(2024, 1, 1, 12, 0).toInstant(ZoneOffset.UTC),
                ZoneOffset.UTC
        );

        CalculatorService service = new CalculatorService(ignore, fixedClock);

        assertThat(service.greeting()).isEqualTo("Good afternoon");
    }

    @Test
    void greetingGoodNightAfterEightToMidnight() {
        NumberSource ignore = () -> 0;
        Clock fixedClock = Clock.fixed(
                LocalDateTime.of(2024, 1, 1, 20, 0).toInstant(ZoneOffset.UTC),
                ZoneOffset.UTC
        );
        CalculatorService service = new CalculatorService(ignore, fixedClock);
        assertThat(service.greeting()).isEqualTo("Good night");
    }

    @Test
    void addTwoAndTwoShouldBeFour() {
        CalculatorService service = new CalculatorService(null, null);
        var result = service.add(2,2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void addOneAndOneShouldBeTwo() {
        CalculatorService service = new CalculatorService(null, null);
        var result = service.add(1, 1);
        assertThat(result).isEqualTo(2);
    }
}
