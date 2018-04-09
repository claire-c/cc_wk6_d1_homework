import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;
    private Printer emptyPrinter;

    @Before
    public void before(){
        printer = new Printer(50);
        emptyPrinter = new Printer(0);
    }

    @Test
    public void hasPaper(){
        assertEquals(50,printer.getPaper());
    }

    @Test
    public void hasEnoughPaperToPrint(){
        assertEquals(30, printer.print(2, 10));
    }

    @Test
    public void doesntHaveEnoughPaperToPrint(){
        assertEquals(0,emptyPrinter.print(2,10));
    }

    @Test
    public void canRefillPaper() {
        assertEquals(150, printer.refill());
        assertEquals(100, emptyPrinter.refill());
    }

}
