package org.example.Strategies;

public class HPStrategy implements PrintStrategy{
    @Override
    public void print() {
        System.out.println("Печатаем обычный документ на принетере HP");
    }

}
