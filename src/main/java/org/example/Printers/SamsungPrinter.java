package org.example.Printers;

import org.example.Strategies.SamsungStrategy;

public class SamsungPrinter extends Printer {

    public SamsungPrinter() {
        this.printStrategy = new SamsungStrategy();
    }
}
