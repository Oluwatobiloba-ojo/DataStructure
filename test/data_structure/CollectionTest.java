package data_structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {
    Collection collection;
    @BeforeEach
    public void setCollection(){
        collection = new Collection();
    }

    @Test
    public void testForThatACollectionIsEmptyByDefault(){
        assertTrue(collection.isEmpty());
    }

    @Test
    public void testThatWhenWeAddToACollection_IsNotEmpty(){
        assertTrue(collection.isEmpty());
        collection.add(5);
        assertFalse(collection.isEmpty());
    }

    @Test
    public void testThatWhenWeAddThreeElement_ToACollection_IsNotEmpty(){
        assertTrue(collection.isEmpty());
        collection.add(5);
        collection.add(6);
        collection.add(10);
        assertFalse(collection.isEmpty());
    }

    @Test
    public void testThatWhenWeAddToACollection_WeAreTo_KnowTheSizeOfIt(){
        assertTrue(collection.isEmpty());
        collection.add(5);
        collection.add(6);
        collection.add(10);
        assertEquals(3, collection.size());
        assertFalse(collection.isEmpty());
    }

    @Test
    public void testThatWhenWeAddTwoElementInToACollection_WhenWeRemove_ItRemainOneInCollection(){
        assertTrue(collection.isEmpty());
        collection.add(5);
        collection.add(6);
        collection.add(10);
        collection.remove(1);
        assertEquals(2, collection.size());
    }

    @Test
    public void testThatWhenWeAddWeCanNowGetAnElementInTheCollection(){
        assertTrue(collection.isEmpty());
        collection.add(5);
        collection.add(6);
        collection.add(10);
        collection.remove(1);
        assertEquals(2, collection.size());
        assertEquals(10,collection.get(1));
    }

    @Test
    public void testThatWhenWeAddThreeElement_RemoveOneElementFromTheCollection_GetThatElementThrowException(){
        assertTrue(collection.isEmpty());
        collection.add(5);
        collection.add(6);
        collection.add(10);
        collection.remove(1);
        collection.remove(0);
        assertEquals(1, collection.size());
        assertThrows(IndexOutOfBoundsException.class, ()-> collection.get(1));
    }

    @Test
    public void testThatWeCanSetAValueInAnCollection(){
        collection.add(3);
        collection.add(4);
        collection.add(6);
        collection.add(1, 7);
        assertEquals(4, collection.size());
        assertEquals(7, collection.get(1));
    }
    @Test
    public void testThatWeCanAddAValueIn_ParticularIndexOfFiveElementInCollection(){
        collection.add(3);
        collection.add(4);
        collection.add(6);
        collection.add(8);
        collection.add(90);
        collection.add(1, 7);
        assertEquals(6, collection.size());
        assertEquals(7, collection.get(1));
    }

    @Test
    public void testThatWhenWeAdd_CanGetAllItem_AddedToTheCollection(){
        collection.add(3);
        collection.add(4);
        collection.add(6);
        collection.add(8);
        collection.add(90);
        collection.add(1, 7);
        assertEquals(7, collection.get(1));
        assertEquals(6, collection.size());
    }

    @Test
    public void testThatWeCanCheckForAnElementWithinTheCollection(){
        collection.add(4);
        collection.add(10);
        collection.add(20);
        assertTrue(collection.contain(10));
    }

    @Test
    public void testThatWeCanCheckForAnElement_IfItIsNotWithinTheCollection(){
        collection.add(4);
        collection.add(10);
        collection.add(20);
        assertFalse(collection.contain(30));
    }

    @Test
    public void testThatWeCanUpdateAValueInTheCollection(){
        collection.add(1);
        collection.add(3);
        collection.set(1, 45);
        assertEquals(45, collection.get(1));
        assertEquals(2, collection.size());
    }

    @Test
    public void testThatICanGetTheSearchForAnElementInMyCollection(){
        collection.add(34);
        collection.add(45);
        collection.add(1, 67);
        assertEquals(67, collection.get(1));
        assertEquals(1, collection.indexOf(67));
    }

    @Test
    public void testThatIfAnElementIsNotInAListAndIWantToFindTheElement_ReturnMinusOne(){
        collection.add(34);
        collection.add(45);
        collection.add(1, 67);
        assertEquals(67, collection.get(1));
        assertEquals(-1, collection.indexOf(78));
    }

    @Test
    public void testThatWeCanGet_AnElementOfACollectionFromTheBack(){
        collection.add(34);
        collection.add(45);
        collection.add(1, 45);
        assertEquals(45, collection.get(1));
        assertEquals(2, collection.lastIndexOf(45));
    }

    @Test
    public void testThatForTheSearchingOfElementFromTheBack_ReturnMinusOne(){
        collection.add(34);
        collection.add(45);
        collection.add(1, 67);
        assertEquals(67, collection.get(1));
        assertEquals(-1, collection.lastIndexOf(78));
    }

    @Test
    public void testThatWhenWeGetAnElementInACollectionAndIndexIsGreaterOrLessThanSizeThrowsException(){
        collection.add(4);
        collection.add(5);
        collection.add(4);
        assertEquals(3, collection.size());
        assertThrows(IndexOutOfBoundsException.class, ()-> collection.get(5));
    }
}