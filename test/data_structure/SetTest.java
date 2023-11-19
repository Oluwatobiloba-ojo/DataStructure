package data_structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    @Test
    public void testThatSetIsEmptyWhenNothingIsAdded(){
        Set set = new Set();
        assertTrue(set.isEmpty());
    }

    @Test
    public void testThatWhenWeAddToTheList_ItIsNotEmpty(){
        Set set = new Set();
        set.add(45);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testThatWhenIAddThreeElement_GetTheSizeAndItThree(){
        Set set = new Set();
        set.add(3);
        set.add(2);
        set.add(5);
        assertFalse(set.isEmpty());
        assertEquals(3, set.size());
    }

    @Test
    public void testThatWhenIAddThreeElement_RemoveOneElementSizeIsTwo(){
        Set set = new Set();
        set.add(3);
        set.add(2);
        set.add(5);
        set.remove(3);
        assertFalse(set.isEmpty());
        assertEquals(2, set.size());
    }

    @Test
    public void testThatWhenWeCanDuplicateElementCanNotBeAddedToASet(){
        Set set = new Set();
        set.add(34);
        set.add(45);
        set.add(34);
        assertEquals(2, set.size());
        assertFalse(set.isEmpty());
    }

    @Test
    public void testThatASetCanBeClear(){
        Set set = new Set();
        set.add(45);
        set.add(34);
        set.add(3);
        set.clear();
        assertEquals(0, set.size());
        assertTrue(set.isEmpty());
    }

    @Test
    public void testThatSetContainAnElementInIt(){
        Set set = new Set();
        set.add(56);
        set.add(66);
        set.add(76);
        assertTrue(set.contain(66));
        assertFalse(set.isEmpty());
    }

    @Test
    public void testThatWhenWeRemoveAnElementInASet(){
        Set set = new Set();
        set.add(56);
        set.add(66);
        set.add(76);
        set.remove(56);
        assertFalse(set.contain(56));
        assertEquals(2, set.size());
    }



}
