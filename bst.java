import java.lang.Math;
class bst{
static class Node{
Node left,right;
int data;
public Node(int t){
data=t;
left=right=null;
}
}
void insert(Node r,int d){
if(d<r.data){
if(r.left==null){
r.left=new Node(d);
}
else{
insert(r.left,d);
}
}
if(d>r.data){
if(r.right==null){
r.right=new Node(d);
}
else{
insert(r.right,d);
}
}
}
void trav(Node r){
if(r!=null){
trav(r.left);
System.out.print(r.data+" ");
trav(r.right);
}
}
int height(Node root){
if(root==null){
return 0;
}
int a=height(root.left);
//System.out.println(a+"h");
if(a==-1){
return -1;
}
int b=height(root.right);
if(b==-1){
return -1;
}
int c=a-b;
System.out.println(a+" "+b+" "+c);
if(Math.abs(c)>1){
return -1;
}
else{
return (Math.max(height(root.left),height(root.right))+1);
}}
public static void main(String args[]){
bst b=new bst();
Node root=new Node(2);
//b.insert(root,4);
//b.insert(root,5);
b.insert(root,1);
//b.insert(root,6);
b.insert(root,0);
//b.trav(root);
System.out.println(b.height(root));
//System.out.println(b.height)
}
}
