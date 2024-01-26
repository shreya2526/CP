import java.util.ArrayList;

public class easy4 {
    public static void main(String[] args) {
        ll l = new ll();
        l.addNext(2);
        l.addNext(7);
        l.addNext(8);
        l.addNext(9);
        l.addNext(10);
        l.reverse(l.head);
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

    node reverse(node h){
        /* 
        ArrayList<Integer> a = new ArrayList<Integer>();
        node t=h;
        int i=0;
        while(t!=null){
            a.add(i, t.data);
            t=t.next;
        }
        t=h;
        i=0;
        while(t!=null && i<a.size()){
            t.data=a.get(i);
            i++;
            t=t.next;
        }*/
        node prev = null;
        node current = head;
        node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return h;
    }
}