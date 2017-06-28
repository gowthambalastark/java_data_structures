import java.util.*;
import java.util.LinkedList;
class graph{
	int V;
	LinkedList<Integer> g[];
	graph(int v){
	V=v;
	g=new LinkedList[v];
	for(int i=0;i<v;i++){
	g[i]=new LinkedList();
	}

	}
	void addit(int a,int b){
	g[a].add(b);
	}
	boolean checkit(int c,int d){
	Iterator<Integer> i;
	int e;
	LinkedList<Integer> q=new LinkedList();
	boolean[] t=new boolean[V];
	q.add(c);
	t[c]=true;
	while(q.size()!=0){
	e=q.poll();
	i=g[e].listIterator();
	while(i.hasNext()){
	int k=i.next();
	if(k==d){
	return true;
	}
	else{
	if(!t[k]){
	t[k]=true;
	q.add(k);
	}
	}
	}
}
return false;
	}
	public static void main(String args[]){
	graph u=new graph(5);
	u.addit(1,2);
	u.addit(1,3);
	u.addit(2,4);
	u.addit(3,4);
	//u.addit(4,5);
	System.out.println(u.checkit(1,5));
	}

}