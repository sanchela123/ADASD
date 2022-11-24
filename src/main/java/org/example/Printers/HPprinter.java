package org.example.Printers;

import org.example.Strategies.HPStrategy;

public class HPprinter extends Printer {

    public HPprinter(){
        this.printStrategy = new HPStrategy();
    }

}
