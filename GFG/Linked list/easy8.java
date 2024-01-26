public class easy8 {
    public static void main(String[] args) {
        ll l = new ll();
        l.addNext(1);
        l.addNext(2);
        l.addNext(3);
        l.addNext(4);
        l.deleteNode(l.findNode(20));
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

    node findNode(int val){
        node temp=head;
        while(temp!=null){
            if(temp.data==val)
                return temp;
            temp=temp.next;
        }
        return null;
    }

    void deleteNode(node del) {
        try{
            if (del != null & del.next != null) {
                del.data = del.next.data;
                node t = del.next;
                del.next = del.next.next;
                t = null;
            }
        }catch(NullPointerException ne){
            System.out.println("node doesn't exist");
        }
        
    }
}