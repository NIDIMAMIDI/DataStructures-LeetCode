import java.util.*;
public class QueueUsing2Stacks<T> {
    private Stack<T> insertionStack;
    private Stack<T> deletionStack;
    public QueueUsing2Stacks(){
        insertionStack = new Stack<>();
        deletionStack = new Stack<>();
    }
    public void enqueue(T item){
        insertionStack.push(item);
    }
    public void dequeue(){
        deletionStack.pop();
    }
}
}

