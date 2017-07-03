import java.util.HashMap;
import java.util.*;
class Node{
	int data;
	Node right,left=null;
	Node(int d){
		data=d;
		right=left=null;
	}
}
class verticalOrder{
	SortedMap<Integer,ArrayList<Integer>> h=new TreeMap<Integer,ArrayList<Integer>>();
	void vertical(Node root,int lvl){
		if(root==null){
			return ;
		}
		else{
			try{
				h.get(lvl).add(root.data);
			}
			catch(Exception e){
				ArrayList<Integer> k=new ArrayList<Integer>();
				k.add(root.data);
				h.put(lvl,k);
			}
			vertical(root.left,lvl-1);
			vertical(root.right,lvl+1);
		}
	}
	void printit(){
		for(Integer i:h.keySet()){
			ArrayList<Integer> b= h.get(i);
			for(Integer c:b){
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right =new Node(8);
		root.right.right.right =new Node(9);
		verticalOrder p = new verticalOrder();
		p.vertical(root, 0);
		p.printit();
	}
}