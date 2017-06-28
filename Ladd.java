class Ladd{
static class Node{
Node next;
int data;
public Node(int n){
data=n;
next=null;
}
}
public Node head1=null,head2=null,head3=null;
int s,c=0;
public void insert1(int d){
Node nw=new Node(d);
nw.next=head1;
head1=nw;
}
public void insert2(int d){
Node nw=new Node(d);
nw.next=head2;
head2=nw;
}
public void insert3(int d){
Node nw=new Node(d);
nw.next=head3;
head3=nw;
//System.out.println(head3.data);
} 
public void add(Node h1,Node h2){
while(h1 != null || h2 !=null){
System.out.println(h1.data+" "+h2.data);
s=c+h1.data+h2.data;
c=0;
if(s>=10){
c=s/10;
s=s%10;
}
insert3(s);
h1=h1.next;
h2=h2.next;
}
if(c!=0){
insert3(c);
}
}
public void show(){
Node a=head3;
while(a!=null){
System.out.println(a.data);
a=a.next;
}
}
public void padit(Node h3,Node h4){
int r=1,t=1;
while(h3.next!=null){
r+=1;
h3=h3.next;
}
while(h4.next!=null){
t+=1;
h4=h4.next;
}
int m=r>t?r-t:t-r;
for(int h=0;h<m;h++){
if(r>t){
h4.next=new Node(0);
h4=h4.next;
}
else{
System.out.println(h3);
h3.next=new Node(0);
h3=h3.next;
}
}
}
public void result(){
insert1(1);
//insert1(0);
//insert2(9);
insert2(1);
insert2(9);
padit(head1,head2);
add(head1,head2);
show();
}
public static void main(String args[]){
Ladd l= new Ladd();
//System.out.println("Bitch 2");
l.result();
}
}
