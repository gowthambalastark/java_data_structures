import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

class btol{
    static	class Tree{
	Tree left,right;
	int data;
	Tree(int x){
		data=x;
		left=null;
		right=null;
	}

}
	public ArrayList<LinkedList<Tree>> level(Tree r){
	ArrayList<LinkedList<Tree>> result=new ArrayList<LinkedList<Tree>>();
	LinkedList<Tree> child=new LinkedList<>();
	if(r==null){
		return null;
	}
	else{
		child.add(r);
	}
	while(child.size()!=0){
		result.add(child);
		LinkedList<Tree> parent=child;
		child=new LinkedList();
		for(Tree children:parent){
			if(children.left!=null){
				child.add(children.left);
			}
			if(children.right!=null){
				child.add(children.right);
			}
		}
	}
    return result;}
    public void addit(){
    	Tree r=new Tree(2);
    	r.left=new Tree(3);
    	r.right=new Tree(4);
    	btol k=new btol();
    	ArrayList<LinkedList<Tree>> f=k.level(r);
    	for(LinkedList te:f){
    		Iterator i=te.iterator();
    		while(i.hasNext()){
    			System.out.println(((Tree)i.next()).data);
    		}
    		}

    	}
    	
    public static void main(String[] args) {
    	btol g=new btol();
    	g.addit();
    }

}