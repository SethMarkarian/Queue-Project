
/**
 * A class that uses an array to implement the methods
 * in the APQueue interface.
 * 
 * Please use the "item cycle" method outlined in the notes.
 */
public class APArrayQueue<T> implements APQueue<T>
{
    private Object[] queue;
    private int size;
    private int timesResized;
    private int front, back;
    
    public APArrayQueue() {
        queue = new Object[10];
        size = 0;
        timesResized = 0;
        int front = 0;
        int back = 0;
    }
    
    public void push(T x) {
        size++;
        resize();
        queue[back] = x;
        back++;
    }
    
    public T pop() {
        T temp = (T) queue[front];
        queue[front] = null;
        size--;
        front++;
        return temp;
    }
    
    public T peek() {
        return (T) queue[front];
    }
    
    public int size() {
        return size;
    }
    
    private void resize() {
        // Leave first three lines the same.
        // Loop
        timesResized++;     
        Object[] oldQueue = queue;
        queue = new Object[queue.length + 5];
        for(int i = 0; i < size; i++){
            queue[i] = oldQueue[i];
        }
        queue = oldQueue;
            }

    public int timesResized() {
        return timesResized;
    }
}
