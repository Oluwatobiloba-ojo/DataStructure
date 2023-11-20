package data_structure;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    public void testThatWhenNothingHasBeenAddedToQueue_SizeIsZero(){
        Queue queue = new Queue();
        assertEquals(0, queue.size());
    }

    @Test
    public void testThatIfWeHaveACapacityAndHaveNotAddedTheQueueIsEmpty(){
        Queue queue = new Queue(3);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatWhenWeAddToAListTheSizeIncrease(){
        Queue queue = new Queue();
        queue.add(5);
        queue.add(4);
        assertEquals(2, queue.size());
    }

    @Test
    public void testThatWhenWeHaveALengthOfThreeAdd_ThreeTimesItThrowsException(){
        Queue queue = new Queue(3);
        queue.add(4);
        queue.add(7);
        queue.add(2);
        assertThrows(IllegalStateException.class, () -> queue.add(4));
    }

    @Test
    public void testForThatWhenWeHaveLength_WeThenOfferANumberMoreThanTheLength_GetToLengthReturnFalse(){
        Queue queue = new Queue(3);
        queue.offer(7);
        queue.offer(9);
        queue.offer(10);
        assertFalse(queue.offer(11));
    }
    @Test
    public void testThatWhenThereIsNoSizeItKeepAddingToTheElement(){
        Queue queue = new Queue();
        queue.add(11);
        queue.add(21);
        queue.add(11);
        queue.add(11);
        queue.offer(21);
        assertEquals(5, queue.size());
    }
    @Test
    public void testThatWeWhenRemoveAQueueItRemovesTheFirstIn(){
        Queue queue = new Queue(4);
        queue.add(2);
        queue.offer(3);
        queue.add(19);
        int number = queue.remove();
        assertEquals(2, number);
        assertEquals(2, queue.size());
    }

    @Test
    public void testThatWhenWeAListIsEmpty_RemoveItThrowsException(){
        Queue queue = new Queue();
        assertThrows(NoSuchElementException.class,()-> queue.remove());
    }

    @Test
    public void testForPollMethodInQueue(){
        Queue queue = new Queue();
        queue.add(45);
        queue.add(3);
        int numb = queue.poll();
        assertEquals(45, numb);
        System.out.println(queue);
    }

    @Test
    public void testThatWhenWeAListIsEmpty_PollItReturnNull(){
        Queue queue = new Queue();
        assertNull(queue.poll());
    }

    @Test
    public void testThatWhenIPeekOverAQueue_ISeeTheFirstElementAdded(){
        Queue queue = new Queue();
        queue.add(3);
        queue.add(40);
        assertEquals(3, queue.peek());
        assertEquals(2, queue.size());
    }

    @Test
    public void testThatWhenTheQueueIsEmpty_IPickedOverItReturnNull(){
        Queue queue = new Queue();
        assertNull(queue.peek());
    }

    @Test
    public void testThatWhenElementOverAQueue_ISeeTheFirstElementAdded(){
        Queue queue = new Queue();
        queue.add(3);
        queue.add(40);
        assertEquals(3, queue.element());
        assertEquals(2, queue.size());
        System.out.println(queue);
    }

    @Test
    public void testThatWhenTheQueueIsEmpty_ICheckElementItThrowsException(){
        Queue queue = new Queue();
        assertThrows(NoSuchElementException.class, () -> queue.element());
        System.out.println(queue);
    }

}