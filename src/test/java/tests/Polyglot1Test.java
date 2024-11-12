package tests;

import controller.Polyglot1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Polyglot1Test {

    @Test
    void testGetCostsByRome() {
        Polyglot1 app = new Polyglot1();
        int total = app.sumCostsByLocation("Rome");
        assertEquals(17_250_535, total);
    }

    @Test
    void testGetCostsByBolzano() {
        Polyglot1 app = new Polyglot1();
        int total = app.sumCostsByLocation("Bolzano");
        assertEquals(9_326_466, total);
    }

    @Test
    void testGetCostsByFlorence() {
        Polyglot1 app = new Polyglot1();
        int total = app.sumCostsByLocation("Florence");
        assertEquals(9_860_087, total);
    }
}
