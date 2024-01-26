public class easy5 {
    public static void main(String[] args) {
        ll l = new ll();
        l.addNext(2);
        l.addNext(2);
        l.addNext(2);
        l.addNext(2);
        //l.print();
        l.removeDuplicate(l.head);
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

    node removeDuplicate(node h){
        node current = h;
        while (current != null && current.next != null){
            if (current.data == current.next.data)
                current.next = current.next.next;
            else 
                current = current.next;
        }

        return h;
    }
}