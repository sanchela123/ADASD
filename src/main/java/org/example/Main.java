package org.example;

import org.example.Printers.CanonPrinter;
import org.example.Printers.HPprinter;
import org.example.Printers.Printer;
import org.example.Printers.SamsungPrinter;



public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        System.out.println("Sviridov Prak 3: Pattern Strategy:");
        System.out.println("------------------------------------");
        Printer firstprinter = new CanonPrinter();
        Printer secondprinter = new SamsungPrinter();
        Printer thirdprinter = new HPprinter();
        Printer abstractprinter = new Printer();
        System.out.println(ANSI_RED  + "Методы абрсрактного принтера:" + ANSI_RESET);
        abstractprinter.diagnostic();
        abstractprinter.refiling();
        System.out.println("------------------------------------");
        System.out.println(ANSI_GREEN + "Методы принтера Canon:" + ANSI_RESET);
        firstprinter.print();
        firstprinter.refiling();
        firstprinter.diagnostic();
        System.out.println("------------------------------------");
        System.out.println(ANSI_PURPLE + "Методы принтера Samsung:" + ANSI_RESET);
        secondprinter.print();
        secondprinter.diagnostic();
        secondprinter.refiling();
        System.out.println("------------------------------------");
        System.out.println(ANSI_YELLOW + "Методы принтрера HP:" + ANSI_RESET);
        thirdprinter.print();
        thirdprinter.refiling();
        thirdprinter.diagnostic();
    }
}