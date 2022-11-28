package Thing;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThingTest {
    @Test
    void createNew(){
        Thing thing= new Thing(5);
        assertNotNull(thing, "Hey");



    }

}
