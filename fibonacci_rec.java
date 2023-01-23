public class fibonacci_rec {
    public static void main(String args[]){
        fibonacci_rec recursion = new fibonacci_rec();
        var rec= recursion.fibonacci(-3);
        System.out.println(rec);
    }
    public int fibonacci(int n)
    {
        if(n<0)
            return -1;
        if(n==0 || n==1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
