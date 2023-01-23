public class factorial_rec {
    public static void main(String args[]){
        factorial_rec recursion = new factorial_rec();
        var rec = recursion.factorial(0);
        System.out.println(rec);
    }
    public int factorial(int n){
        if(n<0)
            return -1;
        if(n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }
}
