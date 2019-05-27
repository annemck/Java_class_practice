import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setup(){
        printer = new Printer(25, 50);
    }

    @Test
    public void checkPagesLeft(){
        assertEquals(25, printer.pagesLeft());
    }

    @Test
    public void canPrint(){
        printer.print(2, 3);
        assertEquals(19, printer.pagesLeft());
    }

    @Test
    public void notEnoughPaperToPrint(){
        printer.print(5, 6);
        assertEquals(25, printer.pagesLeft());
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.checkToner());
    }

    @Test
    public void tonerChangesOnPrint(){
        printer.print(1, 5);
        assertEquals(45, printer.checkToner());
    }

}
