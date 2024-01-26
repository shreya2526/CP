public class easy9 {
    public static void main(String[] args) {
        ll l = new ll();
        l.addNext(12);
        l.addNext(15);
        l.addNext(10);
        l.addNext(11);
        l.addNext(5);
        l.addNext(6);
        l.addNext(2);
        l.addNext(3);
        l.compute(l.head);
        l.print();
    }
}

class ll {
    node head;

    class node {
        int data;
        node next;
    }

    void addNext(int val) {
        node n = new node();
        n.data = val;
        if (head == null)
            head = n;
        else {
            node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = n;
        }
    }

    void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    node compute(node h)
    {
        if (head == null || head.next == null) {
            return head;
        }
    
        head = reverseList(head);
        node current = head;
        node maxNode = head;
        node temp;
    
        while (current != null && current.next != null) {
            if (current.next.data < maxNode.data) {
                temp = current.next;
                current.next = temp.next;
                temp.next = null; // Disconnect the node
            } else {
                current = current.next;
                maxNode = current;
            }
        }
    
        head = reverseList(head);
        return head;
    }

// Helper function to reverse the linked list
private node reverseList(node head) {
    node prev = null;
    node current = head;
    node next;

    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }

    return prev;
}
}