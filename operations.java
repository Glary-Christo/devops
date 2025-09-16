public class operations {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);
    }
    void mul(int a,int b){
        System.out.println(a*b);
    }
    void div(int a, int b){
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        operations op = new operations();
        op.add(10,20);
        op.sub(10,20);
        op.mul(10,20);
        op.div(20,10);
    }
}
