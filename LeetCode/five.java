public class five{
    public static void main(String[] args) {
        int []a={1,2};
        int []b={3,4};

        five f = new five();
        System.out.println("median of two sorted arrays: "+f.medianSortedArray(a, b));
    }

    public double medianSortedArray(int []nums1, int []nums2){

        double med=0.0;
        int m1,m2;
        int []arr=new int[nums1.length+nums2.length];
        int n = arr.length;

        for(int i =0; i<nums1.length;i++)
            arr[i]=nums1[i];
    
        for(int i =0; i<nums2.length;i++)
            arr[nums1.length+i]=nums2[i];

        for(int i =0; i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        
        five.show(arr);
        
        m1=arr[((n+1)/2)-1];
        m2=arr[(((n/2)+((n/2)+1))/2)];
        med=(m1+m2)/2.0;
        
        return med;
    }

    static void show(int []a){
        System.out.println("array elements:");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}




/*  Mean of two unsorted linked lists after sorting and merging them into one linked list

class ll {
    node start;

    class node {
        int data;
        node next;
    }

    void append(int val) {
        node n = new node();
        n.data = val;
        if (start == null)
            start = n;
        else {
            node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    void sort(ll l) {
        node t1 = start;
        node t2 = t1.next;
        int count = 0;
        while (t1 != null) {
            count++;
            t1 = t1.next;
        }
        t1 = start;
        while (count != 0) {
            while (t2 != null) {
                if (t1.data > t2.data) {
                    int temp = t1.data;
                    t1.data = t2.data;
                    t2.data = temp;
                }
                t1 = t1.next;
                t2 = t2.next;
            }
            count--;
            t1 = start;
            t2 = t1.next;
        }
    }

    static void merge(ll l1, ll l2) {
        ll ml = new ll();
        node t1 = l1.start;
        node t2 = l2.start;
        while (t1 != null) {
            ml.append(t1.data);
            t1 = t1.next;
        }
        while (t2 != null) {
            ml.append(t2.data);
            t2 = t2.next;
        }
        ml.sort(ml);
        ml.show();
        ml.median();
    }

    void show() {
        node temp = start;
        System.out.println("List elements are:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void median(){
        node temp=start;
        int sum=0;
        int med=0;
        int count=0;
        while(temp!=null){
            sum+=temp.data;
            count++;
            temp=temp.next;
        }
        med=sum/count;
        System.out.println("Median of the list is: "+med);
    }
}

public class five {
    public static void main(String[] args) {
        ll l1 = new ll();
        l1.append(10);
        l1.append(8);
        l1.append(6);
        l1.append(4);
        l1.append(2);

        l1.show();

        l1.sort(l1);

        l1.show();
        l1.median();

        ll l2 = new ll();
        l2.append(9);
        l2.append(7);
        l2.append(5);
        l2.append(3);
        l2.append(1);

        l2.show();

        l2.sort(l2);
        l2.median();

        l2.show();

        ll.merge(l1, l2);
    }
}
*/