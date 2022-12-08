import java.util.Scanner;

public class smith_OR_joke_no{

    public static int sumDigit(int n) {
        int sum=0;
        while(n>0) {
            int num=n%10;
            sum+=num;
            n/=10;
        }
        return sum;
    }


    public static void main(String[] args) {
        // find factors of number eg 85=5,17
        // add digits of the number(composite) 8+5=13
        // add digits of factors 5+1+7=13
        // if sum of digits of num=sum of digits of factors then it is a smith number


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int ans=0;
        for(int i=2;i<=n;i++) {
            while(n%i==0) {
                System.out.println(i);
                if(i>=10) {
                    ans+=sumDigit(i);
                }
                else {
                    ans+=i;
                }
                n/=i;
            }
        }

        System.out.println(ans);
        System.out.println();
        int sum=sumDigit(num);
        System.out.println(sum);
        if(sum==ans) {
            System.out.println("Smith Number");
        }
        else {
            System.out.println("Not a smith number");
        }
    }

}