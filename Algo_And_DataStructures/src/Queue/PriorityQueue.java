package Queue;

/**
 *
 * @author Abdullah
 */
public class PriorityQueue {

    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQueue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void enqueue(long item) {
        int j;
        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j]) {
                    queArray[j + 1] = queArray[j];
                } else {
                    break;
                }
            }
            queArray[j + 1] = item;
            nItems++;
        }
    }

    public long dequeue() {
        return queArray[--nItems];
    }

    public long peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public static void main(String[] args) {
        PriorityQueue thePQ = new PriorityQueue(5);
        thePQ.enqueue(30);
       
        thePQ.enqueue(50);
        
        thePQ.enqueue(10);
        
        thePQ.enqueue(40);
         thePQ.dequeue();
        thePQ.enqueue(20);
        while (!thePQ.isEmpty()) {
            long item = thePQ.dequeue();
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
