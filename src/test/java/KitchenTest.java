import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setup(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
    }

    @Test
    public void testSize(){
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
        assertNotEquals(1, emptyKitchen.size());
    }

    @Test
    public void testAdd(){
        assertTrue(emptyKitchen.isEmpty());
        emptyKitchen.add("white corn");
        assertFalse(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
        assertEquals(1, emptyKitchen.size());
    }

    @Test
    public void testContains(){
        assertFalse(emptyKitchen.contains("blue corn"));
        assertTrue(kitchenWithOne.contains("yellow corn"));
        assertTrue(kitchenWithMany.contains("blue corn"));
    }

    @Test
    public void testPop(){
        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());
        assertTrue(kitchenWithOne.isEmpty());
        kitchenWithMany.pop();
        kitchenWithMany.pop();
        assertEquals(2, kitchenWithMany.size());
        assertFalse(kitchenWithMany.contains("white corn"));
    }

}
