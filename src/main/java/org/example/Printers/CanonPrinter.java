package org.example.Printers;

import org.example.Strategies.CanonStrategy;

public class CanonPrinter extends Printer{

    public CanonPrinter() {
        this.printStrategy = new CanonStrategy();
    }
}
