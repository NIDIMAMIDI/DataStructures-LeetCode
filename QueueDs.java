public class QueueDs {
    private static Object[] queuearray;
	private static int size;
	private static int front;
    private static int rare;
	public QueueDs(int size)
	{
		this.size=size;
		this.front = -1;
        this.rare  = -1;
		queuearray=new Object[size];
	}
	public void enquque(Object value)
	{
		if(rare == size - 1) {
			System.out.println("Queue is Full");
		}
		else {
            front = 0;
            queuearray[++rare] = value;
		}
	}
	public void dequeue()
	{
		if(front == -1 && front > rare) {
			System.out.println("Queue is Empty");
		}
		else
		{
            queuearray[front] = null;
			front += 1;
		}
	}
	public void peek()
	{
        if(front == -1 && rare == -1){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Top Elements is : " + queuearray[rare]);
        }
    }
	public static void main(String[] args) {
		QueueDs s=new QueueDs(5);
		s.enquque(10);
		s.enquque(20);
		s.enquque(30);
		s.enquque(40);
		s.enquque(50);
         System.out.println("Push Operation : ");
        for(int i=0;i<=rare;i++)
			System.out.println(queuearray[i]);
		s.dequeue();
        System.out.println("After pop Operation : ");
		for(int i=0;i<=rare;i++)
			System.out.println(queuearray[i]);
        s.peek();
	}    
}
