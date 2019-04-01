
    
/**
 * A class that uses a linked data structure
 * to implement the methods
 * in the APQueue<T> interface.
 */
public class APLinkedQueue<T> implements APQueue<T>
{
    private Link<T> bot;
    private Link back, front;
    private int size;
    
    public APLinkedQueue() {
        bot = null;
        back = null;
        front = null;
        size = 0;
    }
    
    public void push(T x) {
        if(back == null){
            back = new Link(x);
        }
        else if(back != null && back.next == null){
            back = new Link(x);
            back.next = front;
        }
        else {
            Link<T> original = back;
            back.next = new Link(x);
            original = back;
        }
        size++;
    }
    
    public T pop() {
        Link<T> current = bot;
        Link<T> prev = null;
        front = front.next;
        if (size == 0) { 
            return null;
        }
        else if(size == 1) {
            T temp = current.data;
            current = null;
            size--;
            return temp;
        }
        else {
            while(current.next != null){
                prev = current;
                current = current.next;
            }
            T temp = current.data;
            prev.next = null;
            size--;
            return temp;
        }   
    }
    
    public T peek() {
        return (T) front.data;
    } 
    
    public int size() {
        return size;
    }
    
    /**
     * A Linked data structure never needs to be resized.
     */
    public int timesResized() {
        return 0;
    }
    
    /**
     * This Link class is similar to the other ones,
     * except that it's a double link, not a single link.
     * A double link has references to both
     * the previous and next links.
     * 
     * All the links in the middle of your queue should reference
     * both the previous and next links. However, the back
     * link should only reference the next link, and the
     * front link should only reference the previous link.
     */
    private class Link<T> {
        public T data;
        public Link previous, next;
        
        public Link(T x) {
            data = x;
        }
    }
}

