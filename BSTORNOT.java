class Node{
	int data;
	Node right,left;
	Node(int x){
		data=x;
		right=left=null;
	}

}
class BSTORNOT{

	boolean checkit(Node r,int min,int max){
		if(r==null){
			return true;
		}
		if(r.data<min || r.data>max){
			return false;
		}
		return (checkit(r.left,Integer.MIN_VALUE,r.data)&&(checkit(r.right,r.data,Integer.MAX_VALUE)));
	}
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(9);
		root.right=new Node(12);
		root.left.left=new Node(8);
		root.right.right=new Node(13);
		BSTORNOT b=new BSTORNOT();
		System.out.println(b.checkit(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}

}