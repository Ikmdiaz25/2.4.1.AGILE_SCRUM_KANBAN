package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class menuaTest {
    public static String aukeratuTestua(int aukera) {
        switch (aukera) {
            case 1:
                return "Metodo arinak / tradizionalak";
            case 2:
                return "Scrum metodologia";
            case 3:
                return "Kanban";
            case 4:
                return "Irten";
            default:
                return "Aukera okerra";
        }
    }

    @Test
    void testAukeratuTestua() {
        assertEquals("Metodo arinak / tradizionalak", aukeratuTestua(1));
        assertEquals("Scrum metodologia", aukeratuTestua(2));
        assertEquals("Kanban", aukeratuTestua(3));
        assertEquals("Irten", aukeratuTestua(4));
        assertEquals("Aukera okerra", aukeratuTestua(7));
    }
}
