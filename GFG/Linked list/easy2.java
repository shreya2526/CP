import java.util.ArrayList;

public class easy2 {
    public static void main(String[] args) {
        ll l1 = new ll();
        l1.addNext(1);
        l1.addNext(2);
        l1.addNext(3);
        l1.addNext(4);
        l1.addNext(5);
        l1.addNext(6);
        //l1.print();
        System.out.println(l1.getNthFromLast(l1.head, 3));
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

    int getNthFromLast(ll.node head2, int n){
        /* 
        ArrayList<Integer> arr= new ArrayList<Integer>();
        node t=head2;
        int count=0;
        while(t!=null){
            arr.add(t.data);
            t=t.next;
        }
        if(n<=arr.size()){
            int i=arr.size()-1;
            while(i>=0){
                count++;
                if(count==n)
                    return arr.get(i);
                i--;
            }
        }
        return -1;
    */
    if (head2 == null || n <= 0) {
        return -1; // Invalid input
    }

    node fast = head2, slow = head2;

    // Move the fast pointer to the nth node from the beginning
    for (int i = 0; i < n; i++) {
        if (fast == null) {
            return -1; // N is greater than the number of nodes in the linked list
        }
        fast = fast.next;
    }

    // Move both pointers until the fast pointer reaches the end
    while (fast != null) {
        slow = slow.next;
        fast = fast.next;
    }

    return (slow != null) ? slow.data : -1;
    }
}
