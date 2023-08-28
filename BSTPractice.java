class Node{
    int value;
    Node right;
    Node left;
    public Node(int value){
        this.value = value;
        right = null;
        left = null; 
    }
}
public class BSTPractice {
    public Node root;
    public void insert(int value){
        if(root == null){
            root = new Node(value);
            return ;
        }
        Node current=root;
        Node parent=null;
        while(current != null){
            parent = current;
            if(value < current.value){
                current = current.left;
            }
            else  if(value > current.value){
                current = current.right;
            }
            else{
                return ;
            }
        }
        Node newNode = new Node(value);
        if(value < parent.value) {
            parent.left = newNode;
        }else{
            parent.right = newNode;
        }

    }
    public int max(){
        Node maxValue = root;
        while(maxValue.right != null){
            maxValue = maxValue.right;
        }  
        return maxValue.value;
    }
    public int min(){
        Node minValue = root;
        while(minValue.right != null){
            minValue = minValue.left;
        }  
        return minValue.value;
    }
    public int getHeight(Node n){
        if(n==null){
            return 0;
        } 
        int leftHeight = getHeight(n.left);
        int rightHeight = getHeight(n.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    boolean search(int data,Node current)
	{
		if(current==null)
			return false;
		if(current.value==data)
		{
			return true;
		}
		else if(current.value>data)
		{
			return search(data,current.left);
		}
		else
		{
			return search(data,current.right);
		}
	}
    public boolean isBalanced(Node n1){
        if(n1==null)
        {
            return true;
        }
        else{
            int lheight=getHeight(n1.left);
            int rheight=getHeight(n1.right);
            if(Math.abs(lheight-rheight)>1)
            {
                return false;
            }
        }
        return isBalanced(n1.left)&& isBalanced(n1.right);
    }
public static void main(String[] args) {
    // TODO Auto-generated method stub
    BSTPractice bst=new BSTPractice();
    bst.insert(10);
    bst.insert(20);
    bst.insert(30);
    bst.insert(40);
    System.out.println(bst.max());
    System.out.println(bst.min());
}

}
