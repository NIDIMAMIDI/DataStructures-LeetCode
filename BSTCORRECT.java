class Node
{
	int data;
	Node left;
	Node right;
	public Node(int item)
	{
		this.data=item;
		this.left=null;
		this.right=null;
	}
}
public class BSTCORRECT {
	private static Node root;
	public BSTCORRECT()
	{
		this.root=null;
	}
	public void insert(int data)
	{
		root=insertRecursive(root,data);
	}
	public Node insertRecursive(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		if(data<root.data)
		{
			root.left=insertRecursive(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=insertRecursive(root.right,data);
		}
		return root;
	}
	void preorder(Node root)
	{
		if(root!=null) {
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
			
	}
	void inorder(Node root)
	{
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
			
	}
	void postorder(Node root)
	{
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
	boolean search(int data,Node current)
	{
		if(current==null)
			return false;
		if(current.data==data)
		{
			return true;
		}
		else if(current.data>data)
		{
			return search(data,current.left);
		}
		else
		{
			return search(data,current.right);
		}
	}
	public static void main(String[] args) {
		BSTCORRECT tree=new BSTCORRECT();
		tree.insert(5);
		tree.insert(3);
		tree.insert(8);
		tree.insert(2);
		tree.insert(4);
		tree.insert(7);
		tree.insert(9);
		tree.preorder(root);
		System.out.println();
		tree.postorder(root);
		System.out.println();
		tree.inorder(root);
		System.out.println();
		System.out.println("element is in tree "+tree.search(3, root));
		
	}
}