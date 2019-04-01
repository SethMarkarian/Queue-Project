
/**
 * A queue is a data structure that works like people standing in
 * a line, or a "queue" as the British say. Items are
 * added to the back, and accessed or removed from the front.
 * 
 * You can do the following with a queue:
 * 
 * - Add a new item to the back.
 * - Remove an item from the front.
 * - Look at the item at the front but not remove it.
 * - Get the size of the queue.
 * 
 * Two important features of a queue are that you can only
 * add items to the back, and you can only see or remove
 * items at the front.
 * 
 * This interface specifies the method headers for a Queue
 * data structure.
 * 
 * Note the method names are the same as the ones in APStack, but
 * they do different things.
 */
public interface APQueue<T>
{
    /**
     * Adds a new item to the back of the queue.
     * This increments the size.
     */
    void push(T x);
    
    /**
     * Removes and returns the front item in the queue.
     * This decrements the size.
     */
    T pop();
    
    /**
     * Returns but does not remove the front item in the queue.
     * This does not change the size.
     */
    T peek();
    
    /**
     * Returns the size.
     */
    int size();
    
    /**
     * Returns the number of times the queue has been resized.
     */
    int timesResized();
}
