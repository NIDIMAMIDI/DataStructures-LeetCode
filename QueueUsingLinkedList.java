class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class QueueUsingLinkedList {
    Node front = null;
    Node rear = null;
    int size = 0;
    public void enqueue(int data){
        Node node = new Node(data);
        if(size ==0){
            front = node;
            rear = node;
        }else{
            rear.next = node;
            node.next = null;
            rear = node;
        }
        this.size +=1;
    }
    public int dequeue(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }else if(size == 1){
            int popData;
            popData = front.data;
            front = null;
            rear = null;
            this.size -= 1;
            return popData;
        }
        else{
            int popData;
            popData = front.data;
            Node current = front.next;
            front.next = null;
            front = current;
            this.size -= 1;
            return popData;
        }
    }
    public void display(){
        Node current = front;
        System.out.println("The Elements are : ");
        for(int i = 0; i < size; i++){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(10);
        queue.display();
       queue.enqueue(20);
       queue.enqueue(200);
       queue.enqueue(205);
       queue.enqueue(2041);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}
