class Tree{
	int data;
	Tree left,right;
	Tree(int x){
		data=x;
		left=right=null;
	}
}
class ksum{
	void sumit(Tree r,int sum,int[] a,int level){
		int i,j;
		if(r==null){
			return ;
		}
		a[level]=r.data;
		int t=0;
		for(i=level;i>=0;i--){
			t+=a[i];
		if(t==sum){
			for(j=i;j<=level;j++){
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}
		sumit(r.left,sum,a,level+1);
		sumit(r.right,sum,a,level+1);
	}
	int depth(Tree r){
		if(r==null){
			return 0;
		}
		return java.lang.Math.max(depth(r.left),depth(r.right)+1);
	}
	public static void main(String[] args) {
		Tree root=new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
		ksum kk=new ksum();
		int nn=kk.depth(root);
		int[] path=new int[nn];
		kk.sumit(root,7,path,0);
	}
}