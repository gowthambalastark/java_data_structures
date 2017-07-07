class Node{
	Node next;
	int data;
	Node(int d){
		data=d;
		next=null;
	}
}
class link{
	void rever(Node head){
		Node nextt=null;
		Node temp=head;
		while(temp!=null){
			temp=head.next;
			head.next=nextt;
			nextt=head;
			head=temp!=null?temp:head;
		}
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}

	public static void main(String[] args) {
		link l=new link();
		Node head=new Node(5);
		head.next=new Node(6);
		head.next.next=new Node(7);	
		head.next.next.next=new Node(8);	
		l.rever(head);
	}
}