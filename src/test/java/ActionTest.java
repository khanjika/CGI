import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActionTest {

    static Action action;

    @BeforeAll
    static void creation() {
        action = new Action ();
    }

    @Test
    void speedChangeTest() {
        action.speedChange ();
        assertEquals (1, action.fan.getSpeed ());

        action.speedChange ();
        assertEquals (2, action.fan.getSpeed ());

        action.speedChange ();
        assertEquals (3, action.fan.getSpeed ());

        action.speedChange ();
        assertEquals (0, action.fan.getSpeed ());
    }

    @Test
    void directionChangeTest() {
        action.directionChange ();
        assertEquals ("Reversed", action.fan.getDirection ());

        action.directionChange ();
        assertEquals ("Forward", action.fan.getDirection ());
    }

}
