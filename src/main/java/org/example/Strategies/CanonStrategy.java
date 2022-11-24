package org.example.Strategies;

public class CanonStrategy implements PrintStrategy {

    @Override
    public void print() {
        System.out.println("Печатаем документ на принтере Canon");
    }
}
