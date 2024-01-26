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

    int getMiddle(node head)
    {/* 
        int count=0;
        node t=head;
        while(t!=null){
            count++;
            t=t.next;
        }
        int mid=count/2;
        int flag=0;
        t=head;
        while(flag!=mid){
            flag++;
            t=t.next;
        }
        return t.data;*/
        node slowPtr = head;
        node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr.data;
    }
}

public class easy3{
    public static void main(String[] args) {
        ll l1 = new ll();
        l1.addNext(1);
        l1.addNext(2);
        l1.addNext(3);
        l1.addNext(4);
        l1.addNext(5);
        l1.addNext(6);
        System.out.println(l1.getMiddle(l1.head));
    }
}