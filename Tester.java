
/**
 * Tester for the Queue classes.
 */
public class Tester
{
    public static void main() {
        APQueue<String> q1 = new APArrayQueue<String>();
        APQueue<String> q2 = new APLinkedQueue<String>();
        
        System.out.println("**************************");
        System.out.println("* First test: ArrayQueue *");
        System.out.println("**************************");
        System.out.println();
        
        tester(q1);
        
        System.out.println("****************************");
        System.out.println("* Second test: LinkedQueue *");
        System.out.println("****************************");
        System.out.println();
        
        tester(q1);
        
        System.out.println();
        System.out.println("************************************************");
        System.out.println("*      Both tests should do the same thing.    *");
        System.out.println("* Except that # of times resized is different. *");
        System.out.println("************************************************");
        System.out.println();
    }
    
    /**
     * You can plug either APArrayq or APLinkedq into
     * this method, because they both implement the APq
     * interface. Polymorphism!
     * 
     * Please write your own tester code to test a few iterations of
     * push(), pop(), peek(), and size().
     */
    private static void tester(APQueue<String> q) {
        q.push("c++");
        q.push("python");
        q.push("java");
        System.out.println("Should be 3: " + q.size());
        
        System.out.println();
        
        System.out.println("Should be c++: " + q.peek());
        System.out.println("Should be 3: " + q.size());
        
        System.out.println();
        
        System.out.println("Should be c++: " + q.pop());
        System.out.println("Should be 2: " + q.size());
        
        System.out.println();
        
        System.out.println("Should be python: " + q.peek());
        System.out.println("Should be 2: " + q.size());
        
        System.out.println();
        
        System.out.println("Should be python: " + q.pop());
        System.out.println("Should be 1: " + q.size());
        
        System.out.println();
        
        System.out.println("Should be java: " + q.peek());
        System.out.println("Should be 1: " + q.size());
        
        System.out.println();
        
        System.out.println("Should be java: " + q.pop());
        System.out.println("Should be 0: " + q.size());
        
        System.out.println();
    }
}
