class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
public class ImpStackUsngLList {
    int size=0;
    Node head = null;
    Node tail = null;
    public void push(int data){
        Node node = new Node(data);
        if(size ==0){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.next = null;
            tail = node;
        }
        this.size +=1;
    }
    public int pop(){
        int popData= 0;
        if(size == 0){
            System.out.println("Stack is Empty");
            return -1;
        }
        else if(size == 1){
            int popD;
            popD = head.data;
            head = null;
            tail = null;
             this.size -= 1;
            return popD;
        }
        else{
            Node current = head;
            while(current.next.next!=null){
                current = current.next;
            }
            current.next = null;
            popData = tail.data;
            tail = current;
            this.size -= 1;
            return popData;
        }
    }
    public void display(){
       
       if(size == 0) System.out.println("Stack is Empty");
       else{
        Node current = head;
        System.out.println(head.data);
        while(current.next!= null){
            current = current.next;
            System.out.println(current.data);
        }
       }
       
    }
    public static void main(String[] args) {
        ImpStackUsngLList stack = new ImpStackUsngLList();
        stack.push(10);
       // stack.push(90);
        stack.display();
        System.out.println(stack.pop());
        stack.display();
    }
}
