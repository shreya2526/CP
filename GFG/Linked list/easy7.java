public class easy7 {
    public static void main(String[] args) {
        ll l = new ll();
        l.addNext(1);
        l.addNext(2);
        l.addNext(3);
        l.addNext(4);
        l.deleteNode(l.head, 2);
        l.print();
    }
}

class ll{
    node head;
    class node{
        int data;
        node next;
    }
    void addNext(int val){
        node n= new node();
        n.data=val;
        if(head==null)
            head=n;
        else{
            node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=n;
        }
    }
    void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    node deleteNode(node head, int x){
	node t=head;
	int count=1;
	while(t!=null){
	    if(x==1){
	        head=head.next;
	        return head;
	    }
	    else if(x-1==count){
	        t.next=t.next.next;
	        return head;
	    }
	    t=t.next;
	    count++;
	}
	return head;
    }
}