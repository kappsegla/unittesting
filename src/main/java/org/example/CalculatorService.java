package org.example;

import java.time.Clock;
import java.time.LocalTime;

public class CalculatorService {

    private final NumberSource numberSource;
    private final Clock timeProvider;
    //Dependency Injection, DI, Constructor injection
    public CalculatorService(NumberSource numberSource, Clock clock) {
        this.numberSource = numberSource;
        this.timeProvider = clock;
    }

    public int addFiveToNumber(){
        return numberSource.getNumber() + 5;
    }

    public String greeting(){
        LocalTime now = LocalTime.now(timeProvider);
        if( now.isBefore(LocalTime.NOON))
            return "Good morning";
        if( now.isBefore(LocalTime.of(20, 0)))
            return "Good afternoon";
        return "Good night";
    }

    public int add(int i, int i1) {
        return i + i1;
    }
}
