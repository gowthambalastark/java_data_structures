import java.lang.Math;
class atot{
	static class Tree{
		Tree left,right;
		int data;
		Tree(int d){
			data=d;
			left=right=null;
		}
	}
	int c=0;
	public Tree insertit(int arr[],int s,int e){
		if(s>e){
			return null;
		}
		 int mid=(s+e)/2;
		Tree node=new Tree(arr[mid]);
		node.left=insertit(arr,s,mid-1);
        node.right=insertit(arr,mid+1,e);
        return node;
			}
	public void showit(Tree ra){
		if(ra!=null){
			showit(ra.left);
			System.out.println(ra.data);
			showit(ra.right);
		}
	}
	public int height(Tree r){
		if(r==null){
			return 0;
		}
		return Math.max(height(r.right),height(r.left)+1);	
		
		
	}
	public static void main(String[] args) {
	int a[]=new int[10];
	for(int i=0;i<10;i++){
		a[i]=i;
	}
	atot g=new atot();
	Tree t=g.insertit(a,0,a.length-1);
	System.out.println(g.height(t)+" "+t.left.data);
	g.showit(t);
	}
}