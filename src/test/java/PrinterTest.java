import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;
    private Printer emptyPrinter;

    @Before
    public void before(){
        printer = new Printer(50, 70);
        emptyPrinter = new Printer(0, 25);
    }

    @Test
    public void hasPaper(){
        assertEquals(50,printer.getPaper());
    }

    @Test
    public void hasEnoughPaperToPrint(){
        printer.print(2,10);
        assertEquals(30, printer.getPaper());
    }

    @Test
    public void doesntHaveEnoughPaperToPrint(){
        emptyPrinter.print(2,10);
        assertEquals(0,emptyPrinter.getPaper());
    }

    @Test
    public void canRefillPaper() {
        printer.refill();
        emptyPrinter.refill();
        assertEquals(150, printer.getPaper());
        assertEquals(100, emptyPrinter.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(70, printer.getToner());
        assertEquals(25, emptyPrinter.getToner());
    }

    @Test
    public void printerReducesToner(){
        printer.print(2,10);
        assertEquals(50, printer.getToner());
    }

    @Test
    public void printerDoesntReduceToner(){
        emptyPrinter.print(2,10);
        assertEquals(25, emptyPrinter.getToner());
    }
  

}
