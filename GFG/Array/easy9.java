public class easy9 {
    public static void main(String[] args) {
        twoStacks t = new twoStacks();
        t.push1(2);
        t.push1(3);
        t.push2(4);
        System.out.print(t.pop1()+" ");
        System.out.print(t.pop2()+" ");
        System.out.print(t.pop2()+" ");
    }
}

class twoStacks{
    int size;
    int top1, top2;
    int []arr;

    public twoStacks(){
        size=100;
        top1=-1;
        top2=size;
        arr=new int[size];
    }

    void push1(int val){
        if(top1<top2-1)
            arr[++top1]=val;
    }

    void push2(int val){
        if(top1<top2-1)
            arr[--top2]=val;
    }

    int pop1(){
        if(top1>=0)
            return arr[top1--];
        else
            return -1;
    }

    int pop2(){
        if(top2<size)
            return arr[top2++];
        else
            return -1;
    }
}
