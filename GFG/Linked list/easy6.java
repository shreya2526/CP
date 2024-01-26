import java.util.HashSet;
public class easy6 {
    public static void main(String[] args) {
        ll l = new ll();
        l.addNext(5);
        l.addNext(2);
        l.addNext(2);
        l.addNext(4);
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
        if (head == null || head.next == null) {
            return head;
        }

        // Create a HashSet to keep track of unique elements.
        HashSet<Integer> seen = new HashSet<>();
        
        // Initialize previous and current pointers.
        node prev = null;
        node current = head;

        while (current != null) {
            // If the current node's data is already seen, skip this node.
            if (seen.contains(current.data)) {
                prev.next = current.next;
            } else {
                // Otherwise, add the data to the HashSet and move the pointers.
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }

        return h;
    }
}