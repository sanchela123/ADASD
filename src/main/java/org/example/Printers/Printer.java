package org.example.Printers;

import org.example.Strategies.PrintStrategy;

public class Printer {

    PrintStrategy printStrategy;

    public void print(){
        printStrategy.print();
    }

    public void diagnostic(){
        System.out.println("Проводим диагностику неполадок");
    }
    public void refiling(){
        System.out.println("Заправляем принтер");
    }
}
