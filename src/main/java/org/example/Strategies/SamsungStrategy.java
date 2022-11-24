package org.example.Strategies;

public class SamsungStrategy implements PrintStrategy{
    @Override
    public void print() {
        System.out.println("Печатаем обычный документ на принетере Samsung");
    }
}
