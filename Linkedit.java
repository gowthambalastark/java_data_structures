import java.util.*;
class Linkedit{
static class Node{
Node next;
int data;
Node(int t){
data=t;
next=null;
}
}
Node head=null,tail=null;
public void insert(int data){
Node k=new Node(data);
k.next=head;
head=k;
}
public void show(){
Node a=head;
while(a!=null){
System.out.println(a.data);
a=a.next;
}
}
public static void main(String args[]){
Linkedit g=new Linkedit();
g.insert(3);
g.insert(4);
g.insert(5);
g.show();
}
}
