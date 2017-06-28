
class Node{
    Node left,right;
    int data;
    Node(int x){
        data=x;
        left=right=null;
    }
}

class LCA{
    static class result{
    Node node;
    boolean b;
    result(Node ne,boolean isa){
        node=ne;
        b=isa;
    }
}

    result findit(Node r,int p,int q){
        if(r==null){
            return new result(null,false);
        }
        if(r.data==p&&r.data==q){
            return new result(r,true);
        }
        result rx=findit(r.left,p,q);
        if(rx.b){
            return rx;
        }
        result ry=findit(r.right,p,q);
        if(ry.b){
            return ry;
        }
        if(rx.node!=null&&ry.node!=null){
            System.out.println(r.data+" in there");
            return new result(r,true);
        }
        else if(r.data==p||r.data==q){
            boolean g=rx.node!=null||ry.node!=null?true:false;
            System.out.println(r.data+" "+g);
            return new result(r,g);
        }
        else{
            return new result(rx.node!=null?rx.node:ry.node,false);
        }

    }

    public static void main(String[] args) {
        LCA a=new LCA();
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        result t=a.findit(root,4,2);
        result u=a.findit(root,3,4);
        result v=a.findit(root,6,7);
        System.out.println(((Node)(t.node)).data+" "+t.b);
        System.out.println(((Node)(u.node)).data+" "+u.b);
        System.out.println(((Node)(v.node)).data+" "+v.b);
            }
}
