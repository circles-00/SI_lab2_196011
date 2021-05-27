import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private SILab2 lab2 = new SILab2();

    @Test
    void MultipleConditionTest() {
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> lab2.function(Collections.singletonList(new Time(70, 0, 2))));
        assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));

        ex = assertThrows(RuntimeException.class, () -> lab2.function(Collections.singletonList(new Time(-70, 0, 2))));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

        ex = assertThrows(RuntimeException.class, () -> lab2.function(Collections.singletonList(new Time(0, 70, 0))));
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        ex = assertThrows(RuntimeException.class, () -> lab2.function(Collections.singletonList(new Time(0, -70, 0))));
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        ex = assertThrows(RuntimeException.class, () -> lab2.function(Collections.singletonList(new Time(0, 0, -70))));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        ex = assertThrows(RuntimeException.class, () -> lab2.function(Collections.singletonList(new Time(24, 0, 7))));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        ex = assertThrows(RuntimeException.class, () -> lab2.function(Collections.singletonList(new Time(24, 7, 0))));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));
    }

}