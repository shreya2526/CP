public class easy1{
    public static void main(String[] args) {
        node head=new node(1);
        head.next=new node(3);
        head.next.next=new node(4);
        head.next.next.next=new node(8);
        head.next.next.next.next=head.next;
        System.out.println(detectLoop(head));
    }

    static boolean detectLoop(node head){
        node sl=head, f=head;
        while(f!=null && f.next!=null){
            sl=sl.next;
            f=f.next.next;
            if(sl==f)
                return true;
        }
        return false;
    }

}

class node{
    int data;
    node next;
    node(int val){
        data=val;
    }
}